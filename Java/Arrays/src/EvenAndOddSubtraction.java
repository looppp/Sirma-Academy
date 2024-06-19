import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputNumbers = sc.nextLine().split(",");
        int totalSum = 0;
        for (int i = 0; i < inputNumbers.length; i++) {
            int currentNumber = Integer.parseInt(inputNumbers[i]);
            if(currentNumber % 2 == 0){
                totalSum += currentNumber;
            } else {
                totalSum -= currentNumber;
            }
        }
        System.out.println(Math.abs(totalSum));
    }
}
