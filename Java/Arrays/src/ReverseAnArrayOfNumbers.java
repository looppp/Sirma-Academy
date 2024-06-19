import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getNumbers = Integer.parseInt(sc.nextLine());
        String[] stringArray = sc.nextLine().split(",");
        int[] arrayOfNumbers = new int[getNumbers];
        for (int i = getNumbers - 1; i >= 0; i--) {
            arrayOfNumbers[getNumbers - 1 - i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println(String.join(" ", Arrays.toString(arrayOfNumbers)));
    }
}
