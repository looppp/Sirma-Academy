import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= counter && counter <= 100; i++) {
            String stars = "*".repeat(i);
            String spaces = " ".repeat(counter - i);
            System.out.printf("%s%s | %s%s%n", spaces, stars, stars, spaces);
        }
    }
}
