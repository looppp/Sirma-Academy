public class GroceryItem extends InventoryItem{
    public GroceryItem(String name, double price, String category, boolean breakable, boolean perishable, String itemID, int quantity) {
        super(name, price, category, breakable, perishable, itemID, quantity);
    }

    @Override
    public double calculateValue() {
        return super.getItemPrice() * super.getQuantity();
    }

    @Override
    public void description() {
        super.description();
        System.out.println("This item is perishable and belongs to the Grocery category.");
    }
}
