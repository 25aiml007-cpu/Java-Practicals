package util;

public class Validator {
    public static boolean isValidMobile(String mobile) {
        return mobile != null && mobile.matches("[0-9]{10}");
    }

    public static boolean isValidAmount(long amount) {
        return amount > 0;
    }

    public static boolean isNotBlank(String value) {
        return value != null && !value.trim().isEmpty();
    }
}