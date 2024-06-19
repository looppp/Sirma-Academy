import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.println(MyShop(product, quantity));
    }

    public static double MyShop(String product, int quantity){
        return  switch (product){
            case "coffee" -> quantity * 1.50;
            case "water" -> quantity * 1.00;
            case "coke" -> quantity * 1.40;
            case "snacks" -> quantity * 2.00;
            default -> 0;
        };
    }
}
