import java.util.ArrayList;
import java.util.Scanner;

public class MatrixBordeрFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        ArrayList<Integer> numbersPlusIndex = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //Top row
        for (int i = 0; i < col; i++) {
            if(i == 0){
                numbersPlusIndex.add(matrix[1][i]);
            }
            numbersPlusIndex.add(matrix[0][i]);
        }

        //Right column
        for (int i = 1; i < row; i++) {
            numbersPlusIndex.add(matrix[i][col - 1]);
        }

        //Bottom row
        for (int i = col - 2; i >= 0; i--) {
            numbersPlusIndex.add(matrix[row - 1][i]);
        }

        //Left column
        for (int i = row - 2; i > 0 ; i--) {
            numbersPlusIndex.add(matrix[i][0]);
        }
//////////////////////////////////////////////////////////////
        //Top row
        for (int i = 0; i < col; i++) {
            matrix[0][i] = numbersPlusIndex.get(index);
            index++;

        }

        //Right column
        for (int i = 1; i < row; i++) {
            matrix[i][col - 1] = numbersPlusIndex.get(index);
            index++;
        }

        //Bottom row
        for (int i = col - 2; i >= 0; i--) {
            matrix[row - 1][i] = numbersPlusIndex.get(index);
            index++;

        }

        //Left column
        for (int i = row - 2; i >= 0 ; i--) {
            matrix[i][0] = numbersPlusIndex.get(index);
            index++;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
