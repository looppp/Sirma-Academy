import java.util.Scanner;

public class UniqueCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());

        for (int i = 2; i < firstNumber; i+=2) {
            for (int j = 2; j <= secondNumber; j++) {
                for (int k = 2; k < thirdNumber; k+=2) {
                    if(isPrime(j)){
                        System.out.printf("%d %d %d", i, j, k);
                        System.out.println();
                    }
                }
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
