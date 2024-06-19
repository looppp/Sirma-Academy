import java.util.Scanner;

public class AlarmAfter15Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine()) + 15;

        if(minutes >= 60){
            hour += 1;
            minutes -=60;
        }
        if(hour >= 24){
            hour -=24;
        }

        System.out.printf("%02d:%02d", hour, minutes);
    }
}
