import java.util.Arrays;
import java.util.Scanner;

public class ExtractANonDecreasingSubsequenceFromAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArray = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int maxNumber = Integer.MIN_VALUE;
        int[] currentSubsequence = new int[inputArray.length];
        int countOfEmptyIndexes = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (maxNumber < inputArray[i]) {
                maxNumber = inputArray[i];
                currentSubsequence[i] = inputArray[i];
            } else {
                currentSubsequence[i] = Integer.MIN_VALUE;
                countOfEmptyIndexes++;
            }
        }
        int[] finalSubsequence = new int[inputArray.length - countOfEmptyIndexes];
        int index = 0;
        for (int i = 0; i < currentSubsequence.length; i++) {
            if(currentSubsequence[i] != Integer.MIN_VALUE){
                finalSubsequence[index++] = currentSubsequence[i];
            }
        }

            System.out.println(String.join(" ", Arrays.toString(finalSubsequence)));
    }
}
