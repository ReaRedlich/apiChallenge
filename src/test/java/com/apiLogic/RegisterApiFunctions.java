package com.apiLogic;

import com.apiHelper.Deserialization;
import com.apiLogic.request.UserRegister;
import com.apiLogic.response.UserDetails;
import com.apiLogic.response.errorResponse.RegisterError;
import okhttp3.ResponseBody;
import retrofit2.Response;
import java.io.IOException;

public class RegisterApiFunctions {
    private RegisterApiManager registerApiManager = new RegisterApiManager();
    private Deserialization deserialization = new Deserialization();

    public UserDetails register(RegisterEndPoint registerEndPoint, UserRegister userRegisterRequest) throws IOException {
        Response<ResponseBody> okResponse =  registerApiManager.register(registerEndPoint, userRegisterRequest);
        return deserialization.getObject(okResponse, UserDetails.class);
    }

    public RegisterError errorRegister(RegisterEndPoint registerEndPoint, UserRegister userRegisterRequest) throws IOException {
        Response<ResponseBody> okResponse =  registerApiManager.errorRegister(registerEndPoint, userRegisterRequest);
        return deserialization.getObject(okResponse, RegisterError.class);
    }
}
