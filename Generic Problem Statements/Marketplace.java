class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}

class Product<T> {
    T category;
    double price;

    Product(T category, double price) {
        this.category = category;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class Marketplace {

    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>(new BookCategory(), 500);
        applyDiscount(book, 10);

        System.out.println(book.getPrice());
    }
}