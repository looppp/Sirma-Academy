import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String reversed = "";
        boolean result = false;

        for (int i = input.length() - 1; i >= 0 ; i--) {
            char currentChar = input.charAt(i);
            reversed = reversed + currentChar;
        }

        if(reversed.equals(input)){
            result = true;
        }

        System.out.println(result);
    }
}
