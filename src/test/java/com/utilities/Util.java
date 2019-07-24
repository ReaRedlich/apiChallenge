package com.utilities;

public class Util {

    public Util() {}

    /**
     * This method will check 2 String values and check if they are equal
     *
     * @param expectedValue
     * @param actualValue
     * @param compareMessage
     * @return
     * @throws Exception
     */
    public boolean compareStringValues(String expectedValue, String actualValue, String compareMessage) throws Exception {
        System.out.println(compareMessage);
        //In case one of them is null, method shouldn't fail, but need to return false instead
        if (expectedValue == null || actualValue == null)
            throw new RuntimeException(String.format("Validate String value --> Expected value: " + expectedValue + ", Actual value: " + actualValue, false));
        //trim() ignore from space, example: "  test " --> "test"
        if (expectedValue.trim().equalsIgnoreCase(actualValue.trim())) {
            System.out.println("Validate String value --> Expected value: " + expectedValue + ", Actual value: " + actualValue);
        } else
            throw new RuntimeException(String.format("Validate String value --> Expected value: " + expectedValue + ", Actual value: " + actualValue, false));
        return true;
    }
}
