import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputElements = sc.nextLine().split("\\s+");
        ArrayDeque<Integer> arrayOfIntegers = new ArrayDeque<>();
        int result = 0;

        for (int i = 1; i < inputElements.length; i+=2) {
            if(i == 1){
                arrayOfIntegers.push(Integer.parseInt(inputElements[0]));
                if(inputElements[i].charAt(0) == '+'){
                    arrayOfIntegers.push(Integer.parseInt(inputElements[i + 1]));
                } else {
                    arrayOfIntegers.push(-Integer.parseInt(inputElements[i + 1]));
                }
            } else {
                if(inputElements[i].charAt(0) == '+'){
                    arrayOfIntegers.push(Integer.parseInt(inputElements[i + 1]));
                } else {
                    arrayOfIntegers.push(-Integer.parseInt(inputElements[i + 1]));
                }
            }
        }

        for (Integer number : arrayOfIntegers) result+= number;
        System.out.println(result);
    }
}
