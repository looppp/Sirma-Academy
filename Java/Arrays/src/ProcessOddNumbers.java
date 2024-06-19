import java.util.Arrays;
import java.util.Scanner;

public class ProcessOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        for (int i = numbers.length - 1; i > 0; i--) {
            if(i % 2 != 0) System.out.printf("%d ", numbers[i] * 2);
        }
    }
}
