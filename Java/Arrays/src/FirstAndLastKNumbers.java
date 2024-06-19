import java.util.Scanner;

public class FirstAndLastKNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elementK = Integer.parseInt(sc.nextLine());
        String[] inputArray = sc.nextLine().split(", ");

        for (int i = 0; i < elementK; i++) {
            System.out.printf("%s ", inputArray[i]);
        }
            System.out.println();

        for (int i = inputArray.length - elementK; i <= inputArray.length - 1; i++) {
            System.out.printf("%s ", inputArray[i]);
        }
    }
}
