import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        ArrayDeque<Integer> stackOfIntegers = new ArrayDeque<>();

        if(inputNumber == 0){
            System.out.println(0);
        } else {
            while(inputNumber != 0){
                stackOfIntegers.push(inputNumber % 2);
                inputNumber /= 2;
            }
        }

        while(stackOfIntegers.size() >0){
            System.out.printf(stackOfIntegers.pop().toString());
        }
    }
}
