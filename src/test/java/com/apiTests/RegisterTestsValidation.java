package com.apiTests;

import com.apiLogic.response.UserDetails;
import com.utilities.Util;

public class RegisterTestsValidation {

    public RegisterTestsValidation() {}
    private Util util = new Util();

    public void validateUserDetails(UserDetails userDetails, String userName, String externalId) throws Exception {
        util.compareStringValues(userName, userDetails.getResult().getUsername(), "Validate user name");
        util.compareStringValues(externalId, userDetails.getResult().getExternalId(), "Validate external id");
    }
}
