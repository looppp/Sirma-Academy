import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rolCol = sc.nextInt();
        int empty = sc.nextInt();
        int[][] matrixOfNumbers = new int[rolCol][rolCol];
        int totalSum = 0;
        
        for (int i = 0; i < rolCol; i++) {
            for (int j = 0; j < rolCol; j++) {
                matrixOfNumbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rolCol; i++) {
           totalSum += matrixOfNumbers[i][i];
        }

        for (int i = 0; i < rolCol; i++) {
            totalSum += matrixOfNumbers[rolCol - 1 - i][i];
        }

        System.out.println(totalSum);
    }
}
