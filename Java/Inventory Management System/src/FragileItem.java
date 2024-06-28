public class FragileItem extends InventoryItem{
    private double weight;
    public FragileItem(String name, double price, String category, boolean breakable, boolean perishable, String itemID, int quantity, double weight) {
        super(name, price, category, breakable, perishable, itemID, quantity);
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    @Override
    public double calculateValue(){
        return getItemPrice() * getQuantity();
    }

    @Override
    public void description(){
        super.description();
        System.out.println("This item is fragile, breakable and weighs " + weight + " kg.");
    }
}
