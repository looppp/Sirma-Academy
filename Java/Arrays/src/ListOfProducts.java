import java.util.Arrays;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputString = sc.nextLine().split(", ");
        String[] currentArray = Arrays.copyOf(inputString, inputString.length);

        for (int i = 0; i < inputString.length - 1; i++) {
            for (int j = 0; j < inputString.length - 1; j++) {
                char fistChar = inputString[j].charAt(0);
                char secondChar = inputString[j + 1].charAt(0);
                if(fistChar > secondChar){
                    String fistWord = inputString[j];
                    String secondWord = inputString[j + 1];
                    currentArray[j] = secondWord;
                    currentArray[j + 1] = fistWord;
                    inputString = currentArray;
                }
            }
        }

        for (int i = 0; i < inputString.length; i++) {
            System.out.printf("%d.%s%n", i + 1, inputString[i]);
        }
    }
}
