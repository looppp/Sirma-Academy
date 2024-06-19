import java.util.Scanner;

public class Numbers1ToNThroughM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = Integer.parseInt(sc.nextLine());
        int inputM = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= inputN ; i+=inputM) {
            System.out.println(i);
        }
    }

}
