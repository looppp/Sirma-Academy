import java.util.Scanner;

public class TreePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int treeSize = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= treeSize * 2; i+=2) {
            System.out.printf("%s%s", " ".repeat(treeSize * 2 - i), "* ".repeat(i));
            System.out.println();
            if(i == (treeSize * 2) - 1){
                System.out.printf("%s%s", " ".repeat(treeSize * 2 - 1), "* ".repeat(1));
            }
        }

    }
}
