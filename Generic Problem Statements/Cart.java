import java.util.*;

public class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void displayItems() {
        System.out.println(items);
    }

    public static void main(String[] args) {
        Cart<String> electronics = new Cart<>();
        electronics.addItem("Mobile");

        Cart<String> clothes = new Cart<>();
        clothes.addItem("Shirt");

        electronics.displayItems();
        clothes.displayItems();
    }
}