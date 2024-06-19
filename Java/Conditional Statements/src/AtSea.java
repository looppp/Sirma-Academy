import java.util.Scanner;

public class AtSea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysToStay = Integer.parseInt(sc.nextLine());
        String typeOfRoom = sc.nextLine().toLowerCase();
        String assessment = sc.nextLine().toLowerCase();
        double totalPrice = 0.0;

        switch (typeOfRoom){
            case "single room":
                totalPrice = 25.00 * (daysToStay - 1);
                break;
            case "apartment":
                totalPrice = 50.00 * (daysToStay - 1);
                if(daysToStay < 10){
                    totalPrice *= 0.7;
                } else if(daysToStay >= 10 && daysToStay <= 15){
                    totalPrice *= 0.65;
                } else {
                    totalPrice *= 0.5;
                }
                break;
            case "presidential":
                totalPrice = 100.00 * (daysToStay - 1);
                if(daysToStay < 10){
                    totalPrice *= 0.9;
                } else if(daysToStay >= 10 && daysToStay <= 15){
                    totalPrice *= 0.85;
                } else {
                    totalPrice *= 0.8;
                }
                break;
        }

        if(assessment.equals("positive")){
            totalPrice *= 1.25;
        } else {
            totalPrice *= 0.9;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
