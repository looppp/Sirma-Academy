import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        boolean hasMemberCard = sc.nextLine().equals("Yes");
        String discount = "";

        if(age < 18){
            discount = "10% discount";
        } else if(age >= 18 && age <= 64){
            if(hasMemberCard){
                discount = "20% discount";
            } else {
                discount = "10% discount";
            }
        } else if(age > 65){
            discount = "30% discount";
        }

        System.out.println(discount);
    }
}
