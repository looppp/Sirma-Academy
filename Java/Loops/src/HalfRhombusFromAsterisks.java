import java.util.Scanner;

public class HalfRhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= inputNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }

        for (int i = inputNumber - 1; i >= 0 ; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
