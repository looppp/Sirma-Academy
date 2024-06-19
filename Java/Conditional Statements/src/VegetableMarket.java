import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        double tomato = 2.50, onion = 1.20, lettuce = 0.85, cucumber = 1.45, pepper = 5.50;
        Scanner sc = new Scanner(System.in);
        String vegetable = sc.nextLine();
        String dayOfWeek = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        double totalPrice = 0.0;
        String error = "";

        switch (dayOfWeek.toLowerCase()){
            case "monday", "tuesday", "wednesday", "thursday", "friday":
                break;
            case "saturday", "sunday":
                tomato = 2.80;
                onion = 1.30;
                cucumber = 1.75;
                pepper = 3.50;
                break;
            default:
                error = "error";
                break;
        }
        switch (vegetable.toLowerCase()){
            case "tomato":
                totalPrice = quantity * tomato;
                break;
            case "onion":
                totalPrice = quantity * onion;
                break;
            case "lettuce":
                totalPrice = quantity * lettuce;
                break;
            case "cucumber":
                totalPrice = quantity * cucumber;
                break;
            case "pepper":
                totalPrice = quantity * pepper;
                break;
            default:
                error = "error";
                break;
        }
        if(error.equals("error")){
            System.out.println(error);
        } else {
            System.out.printf("%.2f", totalPrice);
        }


    }
}
