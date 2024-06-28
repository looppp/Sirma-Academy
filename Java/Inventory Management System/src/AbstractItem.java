public class AbstractItem implements Breakable, Categorizable, Item, Sellable, Perishable {
    private String name;
    private double price;
    private String category;
    private boolean breakable;
    private boolean perishable;

    public AbstractItem(String name, double price, String category, boolean breakable, boolean perishable) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.breakable = breakable;
        this.perishable = perishable;
    }

    @Override
    public boolean isBreakable() {
        return this.breakable;
    }

    @Override
    public void handleBreakage() {
        if(this.perishable){
            System.out.println("This item is breakable handle it with care!");
        }
    }

    @Override
    public void setCategory(String category) {

    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public String details() {
        return "Name: " + this.name + ", Price: " + this.price + ", Category: " + this.category;
    }

    @Override
    public void description() {

    }

    @Override
    public double calculateValue() {
        return 0;
    }

    @Override
    public boolean isPerishable() {
        return this.perishable;
    }

    @Override
    public void handleExpiration() {
        if(this.perishable){
            System.out.println("Check the expiration date! This item is perishable");
        }
    }

    @Override
    public void setItemPrice(double price) {
        this.price = price;
    }

    @Override
    public double getItemPrice() {
        return this.price;
    }
}
