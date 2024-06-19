import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int triangleSize = Integer.parseInt(sc.nextLine());

        PrintTheTriangle(triangleSize);
    }

    public static void PrintTheTriangle(int size){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }

        for (int i = size - 1; i > 0 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }

    }
}
