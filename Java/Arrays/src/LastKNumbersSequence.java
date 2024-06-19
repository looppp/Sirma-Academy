import java.util.Arrays;
import java.util.Scanner;

public class LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int finalSIzeOfArrayN = Integer.parseInt(sc.nextLine());
        int numbersToSumK = Integer.parseInt(sc.nextLine());
        int[] arrayOfNumbers = {1};
        int arrayIndex = 1;

        while (finalSIzeOfArrayN != arrayOfNumbers.length){
            int[] currentArray = Arrays.copyOf(arrayOfNumbers, arrayOfNumbers.length + 1);

            if(arrayOfNumbers.length <= numbersToSumK){
                int currentSum = 0;

                for (int i = 0; i < arrayOfNumbers.length; i++) {
                    currentSum+= arrayOfNumbers[i];
                }

                currentArray[arrayIndex++] = currentSum;
                arrayOfNumbers = currentArray;

            } else {
                int startIndex = arrayOfNumbers.length - numbersToSumK;
                int currentSum = 0;

                for (int i = startIndex; i < arrayOfNumbers.length; i++) {
                    currentSum+= arrayOfNumbers[i];
                }

                currentArray[arrayIndex++] = currentSum;
                arrayOfNumbers = currentArray;

            }

        }
       for (int number : arrayOfNumbers) System.out.printf("%d ", number);

    }
}
