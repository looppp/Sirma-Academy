import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ZeroMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        ArrayList<String> coordinates = new ArrayList<>();


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int currentNumber = sc.nextInt();
                matrix[i][j] = currentNumber;
                if(currentNumber == 0){
                    coordinates.add("" + i + " " + j);
                }

            }
        }
        System.out.println();

        for (int i = 0; i < coordinates.size(); i++) {
            String[] tokens = coordinates.get(i).split("\\s+");
            int zeroRow = Integer.parseInt(tokens[0]);
            int zeroCol = Integer.parseInt(tokens[1]);

            for (int j = zeroRow; j <= zeroRow; j++) {
                for (int k = 0; k < col; k++) {
                    matrix[j][k] = 0;
                }
            }

            for (int j = zeroCol; j <= zeroCol; j++) {
                for (int k = 0; k < row; k++) {
                    matrix[k][j] = 0;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
