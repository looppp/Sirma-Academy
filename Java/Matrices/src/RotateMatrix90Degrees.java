import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix90Degrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int[][] matrixRotated = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrixRotated[j][ (row -1) -i] = matrix[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrixRotated[i][j] + " ");
            }
            System.out.println();
        }

    }
}
