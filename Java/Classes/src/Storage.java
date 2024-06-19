

import java.util.ArrayList;

public class Storage {
    private int capacity;
    private ArrayList<Product> listOfProducts = new ArrayList<>();
    private double totalCost;

    public Storage(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        capacity -= listOfProducts.stream().mapToInt(x -> x.quantity).sum();
        return this.capacity;
    }
    public void addProduct(Product product){
        this.listOfProducts.add(product);
    }
    public void getProcuts(){
        listOfProducts.forEach(x -> System.out.println(x.name));
    }

    public double getTotalCost(){
        totalCost = listOfProducts.stream().mapToDouble(x -> x.quantity * x.price).sum();
        return this.totalCost;
    }

}


