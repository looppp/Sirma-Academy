package SingleResponsibilityPrinciple.Invoice;

public class InvoiceRepository {
    public void saveInvoice(Invoice invoice){
        System.out.println("Saved invoice for customer: " + invoice.getCustomerName());
    }
}
