import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(",");
        String[] reversedArray = new String[inputArray.length];

        for (int i = inputArray.length - 1; i >= 0 ; i--) {
            reversedArray[inputArray.length - 1 - i] = inputArray[i];
        }

        System.out.println(String.join(" ", reversedArray));
    }
}
