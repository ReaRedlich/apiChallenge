package com.apiTests;

import com.apiHellper.CachingApiClientFactory;
import com.apiLogic.RegisterApiFunctions;
import com.apiLogic.RegisterEndPoint;
import com.apiLogic.request.User;
import com.apiLogic.request.UserRegister;
import com.apiLogic.response.UserDetails;

public class RegisterTestsHelper {

    private RegisterApiFunctions registerApiFunctions = new RegisterApiFunctions();
    private CachingApiClientFactory cachingApiClientFactory = new CachingApiClientFactory();
    private RegisterEndPoint registerEndPoint = cachingApiClientFactory.get(RegisterEndPoint.class);
    public RegisterTestsHelper() throws Exception {}

    protected UserDetails callUserRegister() throws Exception {
        User user = new User( "KalturaOTTUser", "Please add new user name", "xympdpkyymlh","1537875168491", "qaott2018+xympdpkyymlh1537875168491@gmail.com",
                "xympdpkyymlh fake address", "xympdpkyymlh fake city", 7, "Please add new external id");
        UserRegister userRegister = new UserRegister(185, user, "password");
        UserDetails userDetails = registerApiFunctions.register(registerEndPoint, userRegister);
        return userDetails;
    }
}
