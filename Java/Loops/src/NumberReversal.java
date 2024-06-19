import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        for (int i = number.length() - 1; i >= 0; i--) {
            System.out.print(number.charAt(i));
        }

    }
}
