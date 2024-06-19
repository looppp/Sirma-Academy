import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputNumber = sc.nextLine();

        for (int i = inputNumber.length() - 1; i >= 0 ; i--) {
            char currentNumberChar = inputNumber.charAt(i);
            int currentNumber = Integer.parseInt(String.valueOf(currentNumberChar));
            if(currentNumber == 0){
                System.out.println("ZERO");
            } else {
                int currentASCII = currentNumber + 33;
                char asciiChar = (char)currentASCII;
                System.out.printf("%s%n",String.valueOf(asciiChar).repeat(currentNumber));
            }

        }
    }
}
