package InterfaceSegregationPrinciple.Machine;

public class Main {
    public static void main(String[] args) {
        MultiFunctionMachine multiFunctionMachine = new MultiFunctionMachine();
        multiFunctionMachine.print();
        multiFunctionMachine.scan();
        multiFunctionMachine.fax();
    }
}
