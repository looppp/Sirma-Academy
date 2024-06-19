import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String city = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        double totalCost = 0.0;

        double teaSofia = 0.50, teaPlovdiv = 0.40, teaVarna = 0.45;
        double waterSofia = 0.80, waterPlovdiv = 0.70, waterVarna = 0.70;
        double juiceSofia = 1.20, juicePlovdiv = 1.15, juiceVarna = 1.10;
        double sweetsSofia = 1.45, sweetsPlovdiv = 1.30, sweetsVarna = 1.35;
        double chipsSofia = 1.60, chipsPlovdiv = 1.50, chipsVarna = 1.55;

        switch (city.toLowerCase()) {
            case "sofia":
                switch (product.toLowerCase()) {
                    case "tea": totalCost = teaSofia * quantity; break;
                    case "water": totalCost = waterSofia * quantity; break;
                    case "juice": totalCost = juiceSofia * quantity; break;
                    case "sweets": totalCost = sweetsSofia * quantity; break;
                    case "chips": totalCost = chipsSofia * quantity; break;
                }
                break;
            case "plovdiv":
                switch (product.toLowerCase()) {
                    case "tea": totalCost = teaPlovdiv * quantity; break;
                    case "water": totalCost = waterPlovdiv * quantity; break;
                    case "juice": totalCost = juicePlovdiv * quantity; break;
                    case "sweets": totalCost = sweetsPlovdiv * quantity; break;
                    case "chips": totalCost = chipsPlovdiv * quantity; break;
                }
                break;
            case "varna":
                switch (product.toLowerCase()) {
                    case "tea": totalCost = teaVarna * quantity; break;
                    case "water": totalCost = waterVarna * quantity; break;
                    case "juice": totalCost = juiceVarna * quantity; break;
                    case "sweets": totalCost = sweetsVarna * quantity; break;
                    case "chips": totalCost = chipsVarna * quantity; break;
                }
                break;
            default:
                System.out.println("Invalid city.");
                break;
        }

        System.out.printf("%.2f", totalCost);
    }
}
