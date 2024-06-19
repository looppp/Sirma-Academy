import java.util.Scanner;

public class CountingOrcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialCount = sc.nextInt();
        int increaseAmount = sc.nextInt();
        int hours = sc.nextInt();

        int result = initialCount + (hours - 1) * increaseAmount;
        System.out.println(result);
    }
}
