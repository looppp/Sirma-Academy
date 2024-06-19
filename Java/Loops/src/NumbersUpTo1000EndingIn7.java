import java.util.Scanner;

public class NumbersUpTo1000EndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
            int lastDigit = i % 10;
            if(lastDigit == 7){
                System.out.println(i);
            }
        }
    }
}
