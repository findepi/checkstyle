package org.checkstyle.suppressionxpathfilter.simplifybooleanreturn;

public class InputXpathSimplifyBooleanReturnIfBooleanEqualsBoolean {
    public static boolean toTest() {
        boolean even = false;
        if (even == true) { // warn
            return false;
        }
        else {
            return true;
        }
    }
}
