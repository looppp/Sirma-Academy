import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibonacciInput = sc.nextInt();

        int result = getFibonacci(fibonacciInput);
        System.out.println(result);
    }
    public static int getFibonacci(int n){
        if(n <= 2){
            return 1;
        } else {
            int result = getFibonacci(n - 1) + getFibonacci(n - 2);
           return result ;
        }
    }
}
