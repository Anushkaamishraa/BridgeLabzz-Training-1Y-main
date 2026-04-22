import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}

public class SortProducts {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 800, 4.5),
                new Product("Phone", 500, 4.7),
                new Product("Tablet", 300, 4.2)
        );

        // Sort by price
        products.sort((a, b) -> Double.compare(a.price, b.price));

        products.forEach(p -> System.out.println(p.name + " " + p.price));
    }
}