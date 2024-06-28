import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, InventoryItem> inventory = new HashMap<>();

    public void addItem(InventoryItem item) {
        inventory.put(item.getID(), item);
    }

    public void removeItem(String itemID) {
        inventory.remove(itemID);
    }

    public InventoryItem getItem(String itemID) {
        return inventory.get(itemID);
    }

    public void displayItems() {
        for (InventoryItem item : inventory.values()) {
            item.description();
            System.out.println();
        }
    }

    public void saveInventory(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (InventoryItem item : inventory.values()) {
                writer.write(item.getClass().getSimpleName() + "," +
                        item.getID() + "," +
                        item.getName() + "," +
                        item.getItemPrice() + "," +
                        item.getCategory() + "," +
                        item.getQuantity() + "\n");
            }
        }
    }

    public void loadInventory(String fileName) throws IOException {
        inventory.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String type = parts[0];
                String itemID = parts[1];
                String name = parts[2];
                double price = Double.parseDouble(parts[3]);
                String category = parts[4];
                int quantity = Integer.parseInt(parts[5]);

                InventoryItem item = null;
                switch (type) {
                    case "ElectronicsItem":
                        item = new ElectronicsItem(name, price, category, itemID, quantity);
                        break;
                    case "GroceryItem":
                        item = new GroceryItem(name, price, category, itemID, quantity);
                        break;
                    case "FragileItem":
                        double weight = Double.parseDouble(parts[6]);
                        item = new FragileItem(name, price, category, itemID, quantity, weight);
                        break;
                }
                if (item != null) {
                    addItem(item);
                }
            }
        }
    }
}

