import java.util.Scanner;

public class PrintEveryNElementFromAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrayInput = sc.nextLine().split(",");
        int stepN = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < arrayInput.length; i++) {
            if(i % stepN == 0){
                System.out.printf(arrayInput[i] + " ");
            }
        }
    }
}
