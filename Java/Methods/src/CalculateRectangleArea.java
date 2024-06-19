import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA = Integer.parseInt(sc.nextLine());
        int inputB = Integer.parseInt(sc.nextLine());

        System.out.println(CalcRectangleArea(inputA, inputB));
    }

    public static int CalcRectangleArea(int sideA, int sideB){
        return sideA * sideB;
    }
}
