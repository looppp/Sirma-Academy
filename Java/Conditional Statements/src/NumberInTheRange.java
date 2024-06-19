import java.text.DecimalFormat;
import java.util.Scanner;

public class NumberInTheRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber = Double.parseDouble(sc.nextLine());
        double secondNumber = Double.parseDouble(sc.nextLine());
        double result = 0.0;
        String operation = sc.nextLine();
        DecimalFormat df = new DecimalFormat("#.##");

        switch (operation){
            case "add":
                result = firstNumber + secondNumber;
                break;
            case "subtract":
                result = firstNumber - secondNumber;
                break;
            case "divide":
                result = firstNumber / secondNumber;
                break;
            case "multiply":
                result = firstNumber * secondNumber;
                break;

        }
        System.out.printf(df.format(result));
    }
}
