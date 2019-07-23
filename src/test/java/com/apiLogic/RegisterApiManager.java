package com.apiLogic;

import com.apiHellper.Request;
import com.apiHellper.Validations;
import com.apiLogic.request.UserRegister;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import java.io.IOException;

public class RegisterApiManager {
    private Request request = new Request();
    private Validations validations = new Validations();

    public Response<ResponseBody> register(RegisterEndPoint registerEndPoint, UserRegister userRegisterRequest) throws IOException {
        RequestBody requestBody = request.createBody(userRegisterRequest);
        Call<ResponseBody> call = registerEndPoint.register(requestBody);
        System.out.println("Api: [" +  call.request().method() + "] "  + call.request().url());
        return validations.ok(call);
    }
}
