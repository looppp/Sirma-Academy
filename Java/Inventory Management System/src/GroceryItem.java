public class GroceryItem extends InventoryItem{
    public GroceryItem(String name, double price, String category, String itemID, int quantity) {
        super(name, price, category, false, true, itemID, quantity);
    }

    @Override
    public double calculateValue() {
        return super.getItemPrice() * super.getQuantity();
    }

    @Override
    public void description() {
        super.description();
        System.out.println(getName() +  " is perishable and belongs to the Grocery category.");
    }
}
