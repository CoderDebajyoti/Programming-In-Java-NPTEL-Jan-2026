import java.util.Scanner;

public class W07_P5 {
    private String password;

    // Constructor
    public W07_P5(String password) {
        this.password = password;
    }

    public boolean isValidPassword(String password) {

        // Check minimum length
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Password valid if it has both
        if (hasUpperCase && hasDigit) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPassword = scanner.nextLine();
        scanner.close();

        W07_P5 validator = new W07_P5(inputPassword);

        if (validator.isValidPassword(inputPassword)) {
            System.out.print("Valid Password");
        } else {
            System.out.print("Invalid Password");
        }
    }
}