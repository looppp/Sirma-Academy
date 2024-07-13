package OpenClosedPrinciple.Calculator;

public class DiscountCalculator {
    private DiscountStrategy strategy;

    public DiscountCalculator(DiscountStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(DiscountStrategy strategy){
        this.strategy = strategy;
    }

    public double calculateDiscount(double price){
        return strategy.calculateDiscount(price);
    }
}
