import java.util.Arrays;
import java.util.Scanner;

public class SmallestTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayOfNumbers = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int lowestNumber = Integer.MAX_VALUE;
        int secondLowestNumber = Integer.MAX_VALUE;

        for (int i = 0; i <= arrayOfNumbers.length - 1; i++) {
            if(lowestNumber > arrayOfNumbers[i]){
                if(secondLowestNumber > lowestNumber){
                    secondLowestNumber = lowestNumber;
                }
                lowestNumber = arrayOfNumbers[i];
            }
        }

        System.out.printf("%d %d", lowestNumber, secondLowestNumber);
    }
}
