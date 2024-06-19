import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixRow = sc.nextInt();
        int matrixCol = sc.nextInt();
        String empty = sc.nextLine();

        char[][] matrixOne = new char[matrixRow][matrixCol];

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
              matrixOne[i][j] = sc.next().charAt(0);
            }
        }
        char[][] finalMatrix = new char[matrixRow][matrixCol];

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                char currentChar = sc.next().charAt(0);
                if(currentChar != matrixOne[i][j]){
                    System.out.printf("%c ", finalMatrix[i][j] = '*');
                } else {
                    System.out.printf("%c ", finalMatrix[i][j] = currentChar);
                }
            }
            System.out.println();
        }
    }
}
