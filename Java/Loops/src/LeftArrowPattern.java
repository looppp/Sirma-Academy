import java.util.Scanner;

public class LeftArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= input - 1; i++) {
            System.out.printf("%s%s%n", " ".repeat(input - i), "*".repeat(i));
        }
        for (int i = input - 2; i >= 0 ; i--) {
            System.out.printf("%s%s%n", " ".repeat(input - i), "*".repeat(i));
        }
    }
}
