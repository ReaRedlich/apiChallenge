package com.apiTests;

import org.testng.annotations.Test;

public class RegisterTests extends RegisterTestsHelper{

    public RegisterTests() {}
    private RegisterTestsValidation registerTestsValidation = new RegisterTestsValidation();

    /**
     * Please update the user name and external id to values that not exist
     * Do the update in the test and in method 'callUserRegister()' in class 'RegisterTestsHelper'
     * @throws Exception
     */
    @Test
    public void positiveTest() throws Exception {
        userDetails = callUserRegister("Please add new user name", "password");
        registerTestsValidation.validateUserDetails(userDetails, "Please add new u1111ser name", "Please add new external id");
    }

    @Test
    public void negativeTest() throws Exception {
        error = getErrorMessage("Please add new user name", null);
        registerTestsValidation.validateErrorMessage(error, "Missing parameter [password]");
    }

    @Test
    public void secondNegativeTest() throws Exception {
        error = getErrorMessage(null, "password");
        registerTestsValidation.validateErrorMessage(error, "Argument [username or password] cannot be empty");
    }
}
