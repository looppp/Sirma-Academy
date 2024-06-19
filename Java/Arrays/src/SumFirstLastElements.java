import java.util.Scanner;

public class SumFirstLastElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputStrings = sc.nextLine().split(",");
        int totalSum = 0;
        for (int i = 0; i < inputStrings.length; i++) {
            if(i == 0 || i == inputStrings.length - 1){
                totalSum += Integer.parseInt(inputStrings[i]);
            }
        }
        System.out.println(totalSum);
    }
}
