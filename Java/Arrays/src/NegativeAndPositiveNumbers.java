import java.util.Arrays;
import java.util.Scanner;

public class NegativeAndPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputNumbers = sc.nextLine().split(", ");
        int[] negativeNumbers = new int[0];
        int[] posiviteNumbers = new int[0];
        int positiveCounter = 0;

        for (int i = 0; i < inputNumbers.length; i++) {
            int currentNumber = Integer.parseInt(inputNumbers[i]);

            if (currentNumber < 0){
                int[] currentNegative = Arrays.copyOf(negativeNumbers, negativeNumbers.length + 1);
                for (int j = 1; j < currentNegative.length; j++) {
                    currentNegative[j] = negativeNumbers[j - 1];
                }
                currentNegative[0] = currentNumber;
                negativeNumbers = currentNegative;

            } else {
                int[] currentPositive = Arrays.copyOf(posiviteNumbers, posiviteNumbers.length + 1);
                currentPositive[positiveCounter++] = currentNumber;
                posiviteNumbers = currentPositive;
            }
        }

        for(int number : negativeNumbers) System.out.println(number);
        for(int number : posiviteNumbers) System.out.println(number);
    }
}
