public class TestStorage {
    public static void main(String[] args) {
        Product productOne = new Product("cucumber", 1.50, 15);
        Product productTwo = new Product("tomato", 0.90, 25);
        Product productThree = new Product("bread", 1.10, 8);

        Storage storage = new Storage(50);
        storage.addProduct(productOne);
        storage.addProduct(productTwo);
        storage.addProduct(productThree);
        storage.getProcuts();
        System.out.println(storage.getCapacity());
        System.out.println(storage.getTotalCost());
    }
}
