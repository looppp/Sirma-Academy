public class InventoryItem extends AbstractItem{
    private String itemID;
    private int quantity;

    public InventoryItem(String name, double price, String category, boolean breakable, boolean perishable, String itemID, int quantity) {
        super(name, price, category, breakable, perishable);
        this.itemID = itemID;
        this.quantity = quantity;
    }

    public String getID() {
        return itemID;
    }

    public void setID(String ID) {
        this.itemID = itemID;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    @Override
    public String details(){
        return super.details() + ", ID: " + itemID + ", Quantity: " + quantity;
    }
}
