import java.util.Scanner;

public class sumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int loopSealing = input * 2;
        int sum = 0;

        for (int i = 2; i <= loopSealing ; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
