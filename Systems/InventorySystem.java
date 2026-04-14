import java.util.*;

class Product {
    String name;
    double price;
    int stock;

    Product(String n, double p, int s) {
        name = n;
        price = p;
        stock = s;
    }

    public String toString() {
        return name + " (" + stock + ")";
    }
}

public class InventorySystem {
    public static void main(String[] args) {

        Set<String> productNames = new HashSet<>();

        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk", 50, 2));
        products.add(new Product("Bread", 30, 10));

        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restockHistory = new Stack<>();

        for (Product p : products) {
            productNames.add(p.name);

            if (p.stock < 5) {
                restockQueue.add(p);
            }
        }

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;
            restockHistory.push(p);
            System.out.println("Restocked: " + p);
        }

        if (!restockHistory.isEmpty()) {
            Product last = restockHistory.pop();
            last.stock -= 10;
            System.out.println("Undo Restock: " + last);
        }
    }
}