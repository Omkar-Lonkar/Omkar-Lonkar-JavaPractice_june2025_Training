public class PasswordChecker {

    boolean checkPassword(String password) throws PasswordFormatException {
        if (password.length() < 6)
            throw new PasswordFormatException("The min length should be 6.");
        return true;
    }

    boolean checkUpperCase(String password) throws PasswordFormatException {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        throw new PasswordFormatException("Password should contain atleast 1 uppercase.");
    }

    boolean checkDigit(String password) throws PasswordFormatException {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                return true;
        }
        throw new PasswordFormatException("Password should contain atleast single digit.");
    }

    boolean checkWhiteSpace(String password) throws PasswordFormatException {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isWhitespace(password.charAt(i)))
                throw new PasswordFormatException("Password should not contain any whitespace.");
        }
        return true;
    }

    boolean checkSpecialChar(String password) throws PasswordFormatException {
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetterOrDigit(password.charAt(i))))
                return true;
        }
        throw new PasswordFormatException("Password should contain atleast 1 special character.");
    }

    public static void main(String[] args) {
        PasswordChecker passwordChecker = new PasswordChecker();
        String password = "Abc@123";
        boolean isValid = false;

        try {
            isValid = passwordChecker.checkPassword(password);
            isValid = passwordChecker.checkUpperCase(password);
            isValid = passwordChecker.checkDigit(password);
            isValid = passwordChecker.checkWhiteSpace(password);
            isValid = passwordChecker.checkSpecialChar(password);
            System.out.println("Password Accepted");
        } catch (PasswordFormatException e) {
            System.out.println(e.getMessage());
        }
        

    }
}