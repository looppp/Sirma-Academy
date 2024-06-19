import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = Integer.parseInt(sc.nextLine());

        SignOfTheInteger(inputNumber);
    }

    public static void SignOfTheInteger(int number){
        if(number >= 1){
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0){
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}
