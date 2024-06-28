import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<InventoryItem, Integer> items = new HashMap<>();

    public void addItem(InventoryItem item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<InventoryItem, Integer> entry : items.entrySet()) {
            total += entry.getKey().getItemPrice() * entry.getValue();
        }
        return total;
    }
}
