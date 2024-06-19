import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputNumber = sc.nextLine();
        int inputNumberInt = Integer.parseInt(inputNumber);
        int sumAndToThePower = 0;

        for (int i = 0; i < inputNumber.length(); i++) {
            char currentChar = inputNumber.charAt(i);
            int currentNumber = Integer.parseInt(Character.toString(currentChar));
            sumAndToThePower += (int) Math.pow(currentNumber, inputNumber.length());
        }

        if(inputNumberInt == sumAndToThePower){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
