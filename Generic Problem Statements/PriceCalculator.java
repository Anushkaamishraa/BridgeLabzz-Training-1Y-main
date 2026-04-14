import java.util.*;

class Product {
    double price;

    Product(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    Mobile(double price) {
        super(price);
    }
}

class Laptop extends Product {
    Laptop(double price) {
        super(price);
    }
}

public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;

        for (Product p : items) {
            total += p.getPrice();
        }

        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(10000), new Mobile(20000));
        System.out.println(calculateTotal(mobiles));
    }
}