import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstArray = sc.nextLine().split(",");
        String[] secondArray = sc.nextLine().split(",");
        int sumOfArray = 0;

        if(Arrays.equals(firstArray, secondArray)){
            for (int i = 0; i < firstArray.length; i++) {
                int currentNumber = Integer.parseInt(firstArray[i]);
                sumOfArray += currentNumber;
            }
            System.out.printf("Arrays are identical. SUM: %d", sumOfArray);

        } else {
            for (int i = 0; i < firstArray.length; i++) {
                if(!firstArray[i].equals(secondArray[i])){
                    System.out.printf("Arrays are not identical. Found difference at %d index", i);
                }
            }
        }
    }
}
