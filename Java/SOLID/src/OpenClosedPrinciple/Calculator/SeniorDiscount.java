package OpenClosedPrinciple.Calculator;

public class SeniorDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double price) {
        return price * 0.2;
    }
}
