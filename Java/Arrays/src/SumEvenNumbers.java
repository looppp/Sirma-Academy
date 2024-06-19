import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputNumbers = sc.nextLine().split(",");
        int sumOfNumbers = 0;

        for (int i = 0; i < inputNumbers.length; i++) {
            int selectedNumber = Integer.parseInt(inputNumbers[i]);
            if(selectedNumber % 2 == 0){
                sumOfNumbers += selectedNumber;
            }
        }

        System.out.println(sumOfNumbers);
    }
}
