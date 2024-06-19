import java.util.Scanner;

public class AlternativeConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int numberToPrint = 1;
        int emptySlots = input / 2;
//TODO implement empty space logic or something else(emptySlots*)
        for (int i = 0; i < input; i++) {
            System.out.printf("%s", " ".repeat(emptySlots--));
            for (int j = 0; j <= i && numberToPrint <= input; j++) {
                System.out.printf(" %d", numberToPrint++);
            }
            System.out.println();

        }
    }
}
