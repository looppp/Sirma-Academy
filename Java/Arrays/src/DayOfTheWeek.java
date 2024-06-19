import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if(input <= 0 || input >= 7){
            System.out.println("Invalid day!");
        } else {
            System.out.println(daysOfTheWeek[input - 1]);
        }
    }
}
