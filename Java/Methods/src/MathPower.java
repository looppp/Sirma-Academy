import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberA = Double.parseDouble(sc.nextLine());
        double powerOf = Double.parseDouble(sc.nextLine());

        System.out.println((CalcMathPow(numberA, powerOf)));
    }
    public static double CalcMathPow(double numberA, double powerOf){
        return Math.pow(numberA, powerOf);
    }
}
