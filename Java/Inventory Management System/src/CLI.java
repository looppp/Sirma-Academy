import java.io.IOException;
import java.util.Scanner;

public class CLI {
    private InventoryManager inventoryManager = new InventoryManager();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        while(true){
            displayMenu();
            int choice = Integer.parseInt(sc.nextLine());
            try {
                switch (choice){
                    case 1:
                        addItem();
                        break;
                    case 2:
                        removeItem();
                        break;
                    case 3:
                        inventoryManager.displayItems();
                        break;
                    case 4:
                        saveInventory();
                        break;
                    case 5:
                        loadInventory();
                        break;
                    case 6:
                        placeOrder();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again");
                }
            } catch (Exception e){
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

    private void displayMenu(){
        System.out.println("E-commerce Inventory Management System");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item by ID");
        System.out.println("3. Display Items");
        System.out.println("4. Save Inventory");
        System.out.println("5. Load Inventory");
        System.out.println("6. Place Order");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addItem(){
        System.out.print("Enter item type (1- Electronics, 2- Grocery, 3- Fragile): ");
        int type = Integer.parseInt(sc.nextLine());
        System.out.print("Enter item ID: ");
        String itemID = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter category: ");
        String category = sc.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());

        InventoryItem item = null;
        switch (type) {
            case 1:
                item = new ElectronicsItem(name, price, category, itemID, quantity);
                break;
            case 2:
                item = new GroceryItem(name, price, category, itemID, quantity);
                break;
            case 3:
                System.out.print("Enter weight: ");
                double weight = Double.parseDouble(sc.nextLine());
                item = new FragileItem(name, price, category, itemID, quantity, weight);
                break;
            default:
                System.out.println("Invalid item type.");
        }

        if (item != null) {
            inventoryManager.addItem(item);
            System.out.println("Item added successfully.");
        }
    }

    private void removeItem(){
        System.out.println("Enter item ID: ");
        String itemID = sc.nextLine();
        inventoryManager.removeItem(itemID);
        System.out.println("Item removed successfully");
    }

    private void saveInventory(){
        System.out.print("Enter filename: ");
        String filename = sc.nextLine();
        try {
            inventoryManager.saveInventory(filename);
            System.out.println("Inventory saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving inventory: " + e.getMessage());
        }
    }

    private void loadInventory() {
        System.out.println("Enter fileName: ");
        String fileName = sc.nextLine();
        try{
            inventoryManager.loadInventory(fileName);
            System.out.println("Inventory loaded successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while loading inventory: " + e.getMessage());
        }
    }

    private void placeOrder() {
        Order order = new Order();
        while(true){
            System.out.println("Enter item ID to add to order (or 'done' to finish): ");
            String itemID = sc.nextLine();
            if (itemID.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());
            InventoryItem item = inventoryManager.getItem(itemID);
            if (item != null && item.getQuantity() >= quantity) {
                order.addItem(item, quantity);
                item.setQuantity(item.getQuantity() - quantity);
            } else {
                System.out.println("Item not found or insufficient quantity.");
            }
        }
        double total = order.calculateTotal();
        System.out.println("Order total: " + total);

        System.out.print("Choose payment method (1- Credit Card, 2- PayPal): ");

        int paymentMethod = Integer.parseInt(sc.nextLine());

        PaymentProcessor processor = new PaymentProcessor();
        boolean paymentSuccess = false;

        switch (paymentMethod) {
            case 1:
                System.out.print("Enter card number: ");
                String cardNumber = sc.nextLine();
                System.out.print("Enter card holder name: ");
                String cardHolder = sc.nextLine();
                System.out.print("Enter expiry date: ");
                String expiryDate = sc.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = sc.nextLine();
                CreditCardPayment ccPayment = new CreditCardPayment(cardNumber, cardHolder, expiryDate, cvv);
                paymentSuccess = processor.processPayment(ccPayment, total);
                break;
            case 2:
                System.out.print("Enter PayPal email: ");
                String email = sc.nextLine();
                PayPalPayment ppPayment = new PayPalPayment(email);
                paymentSuccess = processor.processPayment(ppPayment, total);
                break;
            default:
                System.out.println("Invalid payment method.");
                return;
        }

        if (paymentSuccess) {
            System.out.println("Payment successful. Order placed.");
        } else {
            System.out.println("Payment failed. Order not placed.");
        }
    }
    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.start();
    }
}
