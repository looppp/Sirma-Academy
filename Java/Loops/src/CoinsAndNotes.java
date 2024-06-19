import java.util.Scanner;

public class CoinsAndNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coinsOfOne = Integer.parseInt(sc.nextLine());
        int coinsOfTwo = Integer.parseInt(sc.nextLine());
        int billOfFive = Integer.parseInt(sc.nextLine());
        int sumToCkeck = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= coinsOfOne; i++) {
            for (int j = 0; j <= coinsOfTwo; j++) {
                for (int k = 0; k <= billOfFive; k++) {
                    if((i*1) + (j*2) + (k*5) == sumToCkeck){
                        System.out.printf("%d * 1 lv. + %d * 2 lv + %d * 5 lv. = %dlv.%n", i, j, k, sumToCkeck);
                    }
                }
            }
        }
    }
}
