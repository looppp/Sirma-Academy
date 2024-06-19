import java.util.Scanner;

public class PseudoFibonacciSequenceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int numOne = 0;
        int numTwo = 1;
        int sumOfPreviousTwo = 0;
        int result = 0;

        for (int i = 0; i < number ; i++) {
            sumOfPreviousTwo = numOne + numTwo;
            numOne = numTwo;
            numTwo = sumOfPreviousTwo;
            result += numOne;
        }

        System.out.println(result);
    }
}
