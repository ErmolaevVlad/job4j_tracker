package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (!isUpperLetterTest(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!isLowerLetterTest(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!isNumber(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isSpecialSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (isStandard(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, "
                    + "password, admin, user");
        }
        return password;
    }

    public static boolean isUpperLetterTest(String password) {
        for (int index = 0; index < password.length(); index++) {
            if (password.codePointAt(index) >= 65 && password.codePointAt(index) <= 90) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLowerLetterTest(String password) {
        for (int index = 0; index < password.length(); index++) {
            if (password.codePointAt(index) >= 97 && password.codePointAt(index) <= 122) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(String password) {
        for (int index = 0; index < password.length(); index++) {
            if (password.codePointAt(index) >= 33 && password.codePointAt(index) <= 47) {
                return true;
            }
            if (password.codePointAt(index) >= 58 && password.codePointAt(index) <= 64) {
                return true;
            }
            if (password.codePointAt(index) >= 91 && password.codePointAt(index) <= 96) {
                return true;
            }
            if (password.codePointAt(index) >= 123 && password.codePointAt(index) <= 126) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumber(String password) {
        for (int index = 0; index < password.length(); index++) {
            if (password.codePointAt(index) >= 48 && password.codePointAt(index) <= 57) {
                return true;
            }
        }
        return false;
    }

    public static boolean isStandard(String password) {
        String[] bad = {"qwerty", "12345", "password", "admin", "user"};
        for (String s : bad) {
            if (password.toLowerCase().contains(s)) {
                return true;
            }
        }
        return false;
    }
}
