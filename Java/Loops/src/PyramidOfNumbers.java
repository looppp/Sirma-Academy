import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = Integer.parseInt(sc.nextLine());
        int numberToPrint = 1;

        for (int i = 1; numberToPrint <= inputNumber; i++) {
            for (int j = 1; j <= i && numberToPrint <= inputNumber; j++) {
                System.out.printf("%d ", numberToPrint++);
            }
                System.out.println();

        }
    }
}
