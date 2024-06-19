import java.util.Scanner;

public class MyltiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = Integer.parseInt(sc.nextLine());

        System.out.println(MultiplyEvenOdds(inputNumber));
    }
    public static int MultiplyEvenOdds(int inputNumber){
        int sumEven = 0;
        int sumOdd = 0;

        while( inputNumber > 0) {
            int digit = inputNumber % 10;
            if(digit % 2 == 0){
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            inputNumber /= 10;
        }
        int result = sumOdd * sumEven;
       return  result;
    }
}
