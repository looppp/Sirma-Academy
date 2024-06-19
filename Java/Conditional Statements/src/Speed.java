import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed = Double.parseDouble(sc.nextLine());

        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 60) {
            System.out.println("average");
        } else if (speed <= 120) {
            System.out.println("fast");
        } else if (speed <= 160) {
            System.out.println("super-fast");
        } else {
            System.out.println("turbo-fast");
        }
    }
}
