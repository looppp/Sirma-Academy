public class FragileItem extends InventoryItem{
    private double weight;
    public FragileItem(String name, double price, String category, String itemID, int quantity, double weight) {
        super(name, price, category, true, false, itemID, quantity);
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
        return getItemPrice() * getQuantity() * this.weight;
    }

    @Override
    public void description(){
        super.description();
        System.out.println(getName() +  " is fragile, breakable and weighs " + weight + " kg.");
    }
}
