import java.util.Scanner;

public class MagicSquareChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        boolean isMagicSquare = true;
        int sumToCheck = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int nextInt = sc.nextInt();
                if(i == 0){
                    sumToCheck += nextInt;
                }
                matrix[i][j] = nextInt;
            }
        }

        for (int i = 0; i < row; i++) {
            int currentSum = 0;
            for (int j = 0; j < col ; j++) {
                currentSum += matrix[i][j];
            }
            if(sumToCheck != currentSum){
                isMagicSquare = false;
            }
            currentSum = 0;
        }

        for (int i = 0; i < row; i++) {
            int currentSum = 0;
            for (int j = 0; j < col ; j++) {
                currentSum += matrix[j][i];
            }
            if(sumToCheck != currentSum){
                isMagicSquare = false;
            }
            currentSum = 0;
        }

        int currentSum = 0;
        for (int i = 0; i < row; i++) {
            currentSum += matrix[i][i];
        }
        if(sumToCheck != currentSum){
            isMagicSquare = false;
        }
        currentSum = 0;

        for (int i = row - 1; i >= 0 ; i--) {
            currentSum += matrix[i][i];
        }
        if(sumToCheck != currentSum){
            isMagicSquare = false;
        }

        if(isMagicSquare){
            System.out.printf("True");
        } else {
            System.out.printf("False");
        }

    }
}
