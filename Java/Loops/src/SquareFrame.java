import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= inputNumber; i++) {
            if(i == 1 || i == inputNumber){
                System.out.printf("+ %s+ %n", "- ".repeat(inputNumber - 2));
            } else {
                System.out.printf("| %s| %n", "- ".repeat(inputNumber - 2));
            }
        }

    }
}
