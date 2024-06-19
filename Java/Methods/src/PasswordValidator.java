import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

       ValidatePassword(password);
    }
    public static void ValidatePassword(String password){
        boolean isValid = true;

        if (password.length() < 6 || password.length() > 10) {
           System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        if (!password.matches("[a-zA-Z0-9]+")) {
            System.out.println("Password must contain only letters and digits");
            isValid = false;
        }

        //long digitCount = password.chars().filter(Character::isDigit).count();
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }
}
