import java.util.Scanner;

public class AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = Integer.parseInt(sc.nextLine());
        int dimensions = Integer.parseInt(sc.nextLine());
        int luggageFee = 0;
        String message = "";


        if(weight > 50){
            luggageFee += 100;
            message = "Overweight";
        }
        if(dimensions > 158){
            if(dimensions - 158 >= 1 && dimensions - 158 <= 20){
                luggageFee += 50;
                message += (message.isEmpty() ? "" : " + ") + "Slightly Oversize";

            } else if(dimensions - 158 >= 21 && dimensions - 158 <= 50) {
                luggageFee += 100;
                message += (message.isEmpty() ? "" : " + ") + "Oversize";

            } else if(dimensions - 158 > 50){
                luggageFee += 200;
                message += (message.isEmpty() ? "" : " + ") + "Oversize";
            }
        }
        if(weight > 50 && dimensions > 158){
            luggageFee += 50;
            message += " + Handling";
        }

        System.out.printf("$%d (%s)", luggageFee, message);
    }
}
