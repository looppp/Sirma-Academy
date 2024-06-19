import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int result = 1;

        for (int i = 1; i <= number ; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
