import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        int numberOne = Integer.parseInt(sc.nextLine());
        int numberTwo = Integer.parseInt(sc.nextLine());

        System.out.println(BasicCalculator(command, numberOne, numberTwo));
    }

    public static int BasicCalculator(String command, int numberA, int numberB){
        return  switch (command.toLowerCase()) {
            case "add" -> numberA + numberB;
            case "multiply" -> numberA * numberB;
            case "subtract" -> numberA - numberB;
            case "divide" -> numberA / numberB;
            default -> 0;
        };

    }
}
