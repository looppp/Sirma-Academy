package SingleResponsibilityPrinciple.Invoice;

public class InvoicePrinter {
    public void printInvoice(Invoice invoice){
        System.out.println("Customer: " + invoice.getCustomerName() + "Amount: " + invoice.getAmount());
    }
}
