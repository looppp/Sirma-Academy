import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = Integer.parseInt(sc.nextLine());
        int col = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < row; i++) {
            if(i == 0 || i == row - 1){
                System.out.println("*".repeat(col));
            } else {
                System.out.printf("*%s*%n", " ".repeat(col - 2));
            }
        }
    }
}
