import java.util.Scanner;

public class StaircasePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputStareCase = Integer.parseInt(sc.nextLine());
        int counter = 1;
        int totalPrints = 0;

        for (int i = 1; i <= inputStareCase; i++) {
            if(i > 2){
                for (int j = 1; j <= counter; j++) {
                    System.out.printf("%s", " ".repeat(j));
                }
                counter++;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
