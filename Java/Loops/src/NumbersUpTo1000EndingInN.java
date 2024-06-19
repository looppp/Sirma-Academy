import java.util.Scanner;

public class NumbersUpTo1000EndingInN {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < 1000 ; i++) {
            int lastDigit = i % 10;
            if(lastDigit == n){
                System.out.println(i);
            }
        }
    }
}
