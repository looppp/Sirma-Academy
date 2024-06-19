import java.util.Scanner;

public class RowSumAndColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int currentRowSum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Row Sums: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                currentRowSum += matrix[i][j];
            }
            System.out.print(currentRowSum + ", ");
            currentRowSum = 0;
        }
        System.out.println();

        System.out.print("Column Sums: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                currentRowSum += matrix[j][i];
            }
            System.out.print(currentRowSum + ", ");
            currentRowSum = 0;
        }
    }
}
