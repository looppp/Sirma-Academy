import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberA = Integer.parseInt(sc.nextLine());
        char operator = sc.nextLine().charAt(0);
        int numberB = Integer.parseInt(sc.nextLine());

        System.out.println(MathOperation(numberA, numberB, operator));

    }
    public static int MathOperation(int numberA, int numberB, char operator){
        return  switch (operator) {
            case '+' -> numberA + numberB;
            case '*' -> numberA * numberB;
            case '-' -> numberA - numberB;
            case '/' -> numberA / numberB;
            default -> 0;
        };
    }
}
