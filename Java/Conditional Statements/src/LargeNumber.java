import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        System.out.println(Math.max(x, y));
    }
}
