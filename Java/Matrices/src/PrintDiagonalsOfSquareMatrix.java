import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixDimensions = sc.nextInt();
        int[][] squareMatrix = new int[matrixDimensions][matrixDimensions];

        for (int i = 0; i < matrixDimensions; i++) {
            for (int j = 0; j < matrixDimensions; j++) {
                squareMatrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrixDimensions; i++) {
            System.out.print(squareMatrix[i][i] + " ");
        }

        System.out.println();

        for (int i = 0; i < matrixDimensions; i++) {
            System.out.print(squareMatrix[matrixDimensions - 1 - i][i] + " ");
        }

    }
}
