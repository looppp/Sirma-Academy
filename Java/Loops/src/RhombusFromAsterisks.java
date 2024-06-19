import java.util.Scanner;

public class RhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rhombusSize = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= rhombusSize; i++) {
           System.out.printf("%s%s", " ".repeat(rhombusSize - i), "* ".repeat(i));
           System.out.println();
        }
        for (int i = rhombusSize - 1; i > 0; i--) {
            System.out.printf("%s%s", " ".repeat(rhombusSize - i), "* ".repeat(i));
            System.out.println();
        }

    }
}
