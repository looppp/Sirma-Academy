package OpenClosedPrinciple.Calculator;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator(new StudentDiscount());
        double studentDiscountPrice = calculator.calculateDiscount(100.0);
        System.out.println("Student Discounted Price: " + studentDiscountPrice);

        calculator.setStrategy(new SeniorDiscount());
        double seniorDiscountPrice = calculator.calculateDiscount(100.0);
        System.out.println("Senior Discounted Price: " + seniorDiscountPrice);
    }
}
