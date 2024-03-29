package com.apiTests;

import com.apiHelper.CachingApiClientFactory;
import com.apiLogic.RegisterApiFunctions;
import com.apiLogic.RegisterEndPoint;
import com.apiLogic.request.User;
import com.apiLogic.request.UserRegister;
import com.apiLogic.response.UserDetails;
import com.apiLogic.response.errorResponse.RegisterError;

public class RegisterTestsHelper {

    private RegisterApiFunctions registerApiFunctions = new RegisterApiFunctions();
    private CachingApiClientFactory cachingApiClientFactory = new CachingApiClientFactory();
    private RegisterEndPoint registerEndPoint = cachingApiClientFactory.get(RegisterEndPoint.class);
    public RegisterTestsHelper() {}
    protected RegisterError error;
    private UserRegister userRegister;
    protected UserDetails userDetails;

    protected UserDetails callUserRegister(String userName, String password) throws Exception {
        userRegister = createRequestBody(userName, password);
        return userDetails = registerApiFunctions.register(registerEndPoint, userRegister);
    }

    protected RegisterError getErrorMessage(String userName, String password) throws Exception {
        userRegister = createRequestBody(userName, password);
        return error = registerApiFunctions.errorRegister(registerEndPoint, userRegister);
    }

    private UserRegister createRequestBody(String userName, String password) {
        User user = new User( "KalturaOTTUser", userName, "xympdpkyymlh","1537875168491", "qaott2018+xympdpkyymlh1537875168491@gmail.com",
                "xympdpkyymlh fake address", "xympdpkyymlh fake city", 7, "<Please add new external id>");
        return userRegister = new UserRegister(185, user, password);
    }
}
