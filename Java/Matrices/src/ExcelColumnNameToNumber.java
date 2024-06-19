import java.util.Scanner;

public class ExcelColumnNameToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = 0;

        for (char c : input.toCharArray()){
            int value = (c - 'A' + 1);
            result = result * 26 + value;
        }
        System.out.println(result);
    }
}
