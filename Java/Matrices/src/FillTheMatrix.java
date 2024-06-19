import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrixA = {
                {1, 5, 9, 13},
                {2, 6, 10, 14},
                {3, 7, 11, 15},
                {4, 8, 12, 16}
        };

        int[][] matrixB = {
                {1, 8, 9, 16},
                {2, 7, 10, 15},
                {3, 6, 11, 14},
                {4, 5, 12, 13}
        };

        String[] input = sc.nextLine().split("\\s+");
        int size = Integer.parseInt(input[0]);

        if(input[1].equals("A")){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrixB[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
