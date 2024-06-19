import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixRow = sc.nextInt();
        int matrixCol = sc.nextInt();
        String empty = sc.nextLine();

        int[][] matrixOne = new int[matrixRow][matrixCol];

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                matrixOne[i][j] = sc.nextInt();
            }
        }


        int[][] matrixSum = new int[matrixRow][matrixCol];

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                System.out.printf("%d ", matrixSum[i][j] = sc.nextInt() + matrixOne[i][j]);
            }
            System.out.println();
        }


    }
}
