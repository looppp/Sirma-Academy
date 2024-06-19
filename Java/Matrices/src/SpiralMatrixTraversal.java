import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        getSpiralElements(matrix).forEach(x -> System.out.print(x + " "));

    }

    public static ArrayList<Integer> getSpiralElements (int[][] matrix){
        ArrayList<Integer> result = new ArrayList<>();
        if(matrix.length == 0) return  result;

        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;

        while(left <= right && top <= bottom){
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right --;

            for (int i = right; i >= left ; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom --;

            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }

            left++;
        }
        return  result;
    }
}
