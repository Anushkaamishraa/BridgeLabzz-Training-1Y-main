import java.util.*;

abstract class WarehouseItem {}

class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println(items);
    }

    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> s1 = new Storage<>();
        s1.addItem(new Electronics());

        Storage<Groceries> s2 = new Storage<>();
        s2.addItem(new Groceries());

        s1.displayItems();
        s2.displayItems();
    }
}