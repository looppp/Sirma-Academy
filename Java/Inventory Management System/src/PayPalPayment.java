public class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment for: $" + amount);
        return true;
    }
}
