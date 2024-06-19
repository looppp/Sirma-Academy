import java.util.Scanner;

public class ExcelSumFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int totalSum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        String empty = sc.nextLine();
        String[] input = sc.nextLine().split(":");
        String[] firstPair = input[0].split("");
        String[] secondPair = input[1].split("");
        int startIndexCol = (firstPair[0].charAt(0) - 'A' + 1) ;
        int endIndexCol = (secondPair[0].charAt(0) - 'A' + 1);
        int startIndexRow = Integer.parseInt(firstPair[1]);
        int endIndexRow = Integer.parseInt(secondPair[1]);


        for (int i = startIndexRow - 1; i <= endIndexRow - 1; i++) {
            for (int j = startIndexCol - 1; j <= endIndexCol - 1; j++) {
                totalSum += matrix[i][j];
            }
        }

        System.out.println(totalSum);
    }
}
