public class ElectronicsItem extends InventoryItem{
    public ElectronicsItem(String name, double price, String category, boolean breakable, boolean perishable, String itemID, int quantity) {
        super(name, price, category, breakable, perishable, itemID, quantity);
    }

    @Override
    public double calculateValue(){
        return getItemPrice() * getQuantity();
    }

    @Override
    public void description(){
        super.description();
        System.out.println("This item is breakable and belongs to the Electronics category.");
    }
}
