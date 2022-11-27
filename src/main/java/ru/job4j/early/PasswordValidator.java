package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (isStandard(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, "
                    + "password, admin, user");
        }
        correct(password);
        return password;
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

    public static void correct(String password) {
        boolean lowerLetter = false;
        boolean upperLetter = false;
        boolean specialSymbol = false;
        boolean number = false;
        for (int i = 0; i < password.length(); i++) {
            if (lowerLetter && upperLetter && number && specialSymbol) {
                break;
            } else if (Character.isLowerCase(password.codePointAt(i))) {
                lowerLetter = true;
            } else if (Character.isUpperCase(password.codePointAt(i))) {
                upperLetter = true;
            } else if (Character.isDigit(password.codePointAt(i))) {
                number = true;
            } else {
                specialSymbol = true;
            }
        }
        if (!upperLetter) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!lowerLetter) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!number) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!specialSymbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
    }
}
