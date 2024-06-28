public class ElectronicsItem extends InventoryItem{
    public ElectronicsItem(String name, double price, String category, String itemID, int quantity) {
        super(name, price, category, true, false, itemID, quantity);
    }

    @Override
    public double calculateValue(){
        return getItemPrice() * getQuantity();
    }

    @Override
    public void description(){
        super.description();
        System.out.println(getName() +  " is breakable and belongs to the Electronics category.");
    }
}
