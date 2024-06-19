import java.util.Arrays;
import java.util.Scanner;

public class AddAndRemoveElementsFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] commands = sc.nextLine().split(",");
        int[] numbersArray = new int[0];
        int initialNumber = 1;

        for (String command : commands)
            if (command.equalsIgnoreCase("add")) {
                int[] newArray = Arrays.copyOf(numbersArray, numbersArray.length + 1);
                newArray[newArray.length - 1] = initialNumber++;
                numbersArray = newArray;
            } else if (command.equalsIgnoreCase("remove")) {
                int[] newArray = Arrays.copyOf(numbersArray, numbersArray.length - 1);
                initialNumber++;
                numbersArray = newArray;
            }



        if (numbersArray.length == 0) {
            System.out.println("Empty");
        } else {
            System.out.println(String.join(" ", Arrays.toString(numbersArray)));

        }
    }
}
