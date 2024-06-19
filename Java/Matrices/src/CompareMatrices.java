import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
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

        int matrixRowTwo = sc.nextInt();
        int matrixColTwo = sc.nextInt();
        String emptyTwo = sc.nextLine();

        int[][] matrixTwo = new int[matrixRowTwo][matrixColTwo];

        for (int i = 0; i < matrixRowTwo; i++) {
            for (int j = 0; j < matrixColTwo; j++) {
                matrixTwo[i][j] = sc.nextInt();
            }
        }

        if(Arrays.deepEquals(matrixOne, matrixTwo)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
