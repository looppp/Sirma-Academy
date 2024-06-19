import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        System.out.printf("%s%n", "#".repeat(n + 2));
        int counter = 1;

        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                System.out.printf("%s#", " ".repeat(counter++));
                System.out.printf("%s", " ".repeat(n - 2 - i));
                System.out.printf("#%n");
            }
        }

        if(n % 2 != 0){
            System.out.printf("%s%s%n", " ".repeat(n / 2), " #");
            counter = n / 2;
        } else {
            counter = n / 2 - 1;
        }

        for (int i = n - 3; i >= 0 ; i--) {
            if (i % 2 == 0) {
                System.out.printf("%s#", " ".repeat(counter--));
                System.out.printf("%s", " ".repeat(n - 2 - i));
                System.out.printf("#%n");
            }
        }
        System.out.printf("%s%n", "#".repeat(n + 2));

    }
}
