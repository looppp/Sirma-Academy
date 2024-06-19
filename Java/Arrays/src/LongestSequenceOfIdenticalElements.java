import java.util.Arrays;
import java.util.Scanner;

public class LongestSequenceOfIdenticalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputNumbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int sequenceCounter = 0;
        int currentSelectedNumber = Integer.MIN_VALUE;


        for (int i = 0; i < inputNumbers.length; i++) {
            //TODO Finish it
        }

    }
}
