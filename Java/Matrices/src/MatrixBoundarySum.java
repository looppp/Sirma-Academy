import java.util.Scanner;

public class MatrixBoundarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int totalSum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i == 0; i++) {
            for (int j = 1; j < col - 1; j++) {
                totalSum += matrix[i][j];
            }
        }

        for (int i = row - 1; i == row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                totalSum += matrix[i][j];
            }
        }

        for (int i = 0; i == 0; i++) {
            for (int j = 0; j < row; j++) {
                totalSum += matrix[j][i];
            }
        }

        for (int i = col - 1; i == col - 1; i++) {
            for (int j = 0; j < row; j++) {
                totalSum += matrix[j][i];
            }
        }

        System.out.println(totalSum);
    }
}
