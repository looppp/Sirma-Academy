package SingleResponsibilityPrinciple.Invoice;

public class Invoice {
    private double amount;
    private String customerName;

    public Invoice(double amount, String customerName){
        this.amount = amount;
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


}
