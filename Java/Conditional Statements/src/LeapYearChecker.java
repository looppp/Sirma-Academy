import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputYear = Integer.parseInt(sc.nextLine());

        if((inputYear % 4 == 0 && inputYear % 100 != 0) || inputYear % 400 == 0){
            System.out.println("It‘s a leap year!");
        } else {
            System.out.println("It‘s not a leap year.");

        }
    }
}
