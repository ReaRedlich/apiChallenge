package com.apiTests;

import com.apiLogic.response.UserDetails;
import org.testng.annotations.Test;

public class RegisterTests extends RegisterTestsHelper{

    public RegisterTests() throws Exception {}
    private RegisterTestsValidation registerTestsValidation = new RegisterTestsValidation();

    /**
     * Please update the user name and external id to values that not exist
     * Do the update in the test and in method 'callUserRegister()' in class 'RegisterTestsHelper'
     * @throws Exception
     */
    @Test
    public void positiveTest() throws Exception {
        UserDetails userDetails = callUserRegister();
        registerTestsValidation.validateUserDetails(userDetails, "Please add new user name", "Please add new external id");
    }
}
