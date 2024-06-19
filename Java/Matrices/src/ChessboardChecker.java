import java.util.Scanner;

public class ChessboardChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] chessMatrix = new int[row][col];
        boolean isThreaten = false;
        int queenCounter = 0;

        //Insert the chess figures and check the rows.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int currentNumber = sc.nextInt();
                if(currentNumber == 1) queenCounter++;
                chessMatrix[i][j] = currentNumber;
            }
            if(queenCounter > 1) isThreaten = true;
            queenCounter = 0;
        }

        //Check the columns
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int currentNumber = chessMatrix[j][i];
                if(currentNumber == 1) queenCounter++;
            }
            if(queenCounter > 1) isThreaten = true;
            queenCounter = 0;
        }

        //Check the long diagonals
        for (int i = 0; i < row; i++) {
            int currentNumber = chessMatrix[i][i];
            if(currentNumber == 1) queenCounter++;
        }
        if(queenCounter > 1) isThreaten = true;
        queenCounter = 0;

        for (int i = 0; i < row; i++) {
            int currentNumber = chessMatrix[row - 1 - i][i];
            if(currentNumber == 1) queenCounter++;
        }
        if(queenCounter > 1) {
            isThreaten = true;
            queenCounter = 0;
        }

        //Check the short diagonals
        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                int currentNumber = chessMatrix[i][j];
                int topRight = chessMatrix[i + 1][j + 1];
                int bottomRight = chessMatrix[i - 1][j + 1];
                int topLeft = chessMatrix[i + 1][j - 1];
                int bottomLeft = chessMatrix[i - 1][j - 1];
                int top = chessMatrix[i - 1][j];
                int bottom = chessMatrix[i + 1][j];
                int left = chessMatrix[i][j - 1];
                int right = chessMatrix[i][j + 1];

                if(currentNumber == 1){
                    if (currentNumber == topRight || currentNumber == bottomRight ||
                            currentNumber == topLeft || currentNumber == bottomLeft) {
                        isThreaten = true;
                        break;
                    }
                }
                if(left == top || top == right || right == bottom || bottom == left) {
                    isThreaten = true;
                    break;
                }
            }
        }

        if(isThreaten){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
