import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfStars = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < countOfStars; i++) {
            for (int j = 0; j < countOfStars; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
