package InterfaceSegregationPrinciple.Machine;

public class MultiFunctionMachine implements Printer, Fax, Scanner {
    @Override
    public void fax() {
        System.out.println("Printing...");
    }

    @Override
    public void print() {
        System.out.println("Faxing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}
