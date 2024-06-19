import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixRow = sc.nextInt();
        int matrixCol = sc.nextInt();
        String empty = sc.nextLine();
        int biggestSum = 0;

        int[][] resultMatrix = new int[2][2];
        int[][] matrixOne = new int[matrixRow][matrixCol];

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                matrixOne[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrixRow - 1; i++) {
            for (int j = 0; j < matrixCol - 1; j++) {
                int currentTotal = matrixOne[i][j] + matrixOne[i][j + 1]
                                 + matrixOne[i + 1][j] + matrixOne[i + 1][j + 1];
                if(currentTotal > biggestSum){
                    biggestSum = currentTotal;
                    resultMatrix[0][0] = matrixOne[i][j];
                    resultMatrix[0][1] = matrixOne[i][j + 1];
                    resultMatrix[1][0] = matrixOne[i + 1][j];
                    resultMatrix[1][1] = matrixOne[i + 1][j + 1];
                }
            }
        }
        System.out.println(matrixRow);
        System.out.println(matrixCol);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%d ", resultMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
