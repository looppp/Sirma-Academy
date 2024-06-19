import java.util.Scanner;

public class EvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumberStartIndex = Integer.parseInt(sc.nextLine());
        int secondNumberStartIndex = Integer.parseInt(sc.nextLine());
        int sumWithFirst = Integer.parseInt(sc.nextLine());
        int sumWithSecond = Integer.parseInt(sc.nextLine());

        int firstNumberEndIndex = firstNumberStartIndex + sumWithFirst;
        int secondNumberEndIndex = secondNumberStartIndex + sumWithSecond;

        for (int i = firstNumberStartIndex; i < firstNumberEndIndex; i++) {
            for (int j = secondNumberStartIndex; j < secondNumberEndIndex; j++) {
                if(isPrime(i) && isPrime(j)){
                    System.out.printf("%d%d%n", i, j);
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
