import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lostGames = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());
        double totalCost = 0.0;
        int trashCombo = 0;

        for (int i = 1; i <= lostGames; i++) {
            if(i % 2 == 0){
                totalCost += headsetPrice;
            }
            if(i % 3 == 0){
                totalCost += mousePrice;
            }
            if(i % 2 == 0 && i % 3 == 0){
                totalCost += keyboardPrice;
                trashCombo++;
            }
            if(trashCombo % 2 == 0 && trashCombo > 0){
                totalCost += displayPrice;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", totalCost);
    }
}
