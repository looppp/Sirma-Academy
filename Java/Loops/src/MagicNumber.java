import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int magicNumber = Integer.parseInt(sc.nextLine());
        int counter = 0;
        boolean combinationFound = false;

        for (int i = firstNumber; i <= secondNumber && !combinationFound && firstNumber <= 999 && secondNumber <= 1000 ; i++) {
            for (int j = firstNumber; j <= secondNumber && !combinationFound; j++) {
                counter++;
                if(i + j == magicNumber){
                    System.out.printf("Combination %d - (%d + %d = %d)", counter, i, j, magicNumber);
                     combinationFound = true;
                }
            }
        }

        if(counter == 0 && firstNumber > 999 && secondNumber > 1000){
            System.out.println("Input numbers are out of bounds!");
        } else if (!combinationFound){
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
