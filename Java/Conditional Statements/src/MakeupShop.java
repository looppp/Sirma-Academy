import java.util.Scanner;

public class MakeupShop {
    public static void main(String[] args) {
        double powder = 2.60;
        double lipstick = 3.0;
        double spiral = 4.10;
        double shadow = 8.20;
        double concealer = 2.0;
        double totalSum = 0.0;
        int countOfMakeup = 0;
        double profit = 0.0;

        Scanner sc = new Scanner(System.in);
        double renovationCost = Double.parseDouble(sc.nextLine());
        int powders = Integer.parseInt(sc.nextLine());
        int lipsticks = Integer.parseInt(sc.nextLine());
        int spirals = Integer.parseInt(sc.nextLine());
        int shadows = Integer.parseInt(sc.nextLine());
        int correctors = Integer.parseInt(sc.nextLine());

        countOfMakeup = powders + lipsticks + spirals + shadows + correctors;
        totalSum = powders * powder +
                lipsticks * lipstick +
                spiral * spirals +
                shadows * shadow +
                concealer * correctors;
        if(countOfMakeup >= 50){
            totalSum *= 0.75;
        }
        totalSum *= 0.9;

        if(totalSum > renovationCost){
            profit = totalSum - renovationCost;
            System.out.printf("Yes! %.2f lv left.",profit);

        } else {
            profit = Math.abs(totalSum - renovationCost);
            System.out.println("Not enough money!");
            System.out.printf("%.2f lv needed.",profit);

        }
    }
}
