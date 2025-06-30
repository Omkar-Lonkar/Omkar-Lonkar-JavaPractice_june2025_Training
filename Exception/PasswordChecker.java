public class PasswordChecker {

    boolean checkPassword(String password) throws PasswordFormatException {
        if (password.length() < 6)
           throw new PasswordFormatException("The min length should be 6.");
        return true;

    }

    public static void main(String[] args) {
        PasswordChecker passwordChecker = new PasswordChecker();
        String password = "abc123";
        boolean isValid = false;

        try {
            isValid = passwordChecker.checkPassword(password);
        } catch (PasswordFormatException e) {
            System.out.println(e.getMessage());
        }

    }
}
