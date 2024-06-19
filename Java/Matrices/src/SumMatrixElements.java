import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixRow = sc.nextInt();
        int matrixCol = sc.nextInt();
        int matrixSum = 0;
        String empty = sc.nextLine();

        int[][] matrixOne = new int[matrixRow][matrixCol];

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                matrixOne[i][j] = sc.nextInt();
                matrixSum+= matrixOne[i][j];
            }
        }

        System.out.println(matrixRow);
        System.out.println(matrixCol);
        System.out.println(matrixSum);
    }
}
