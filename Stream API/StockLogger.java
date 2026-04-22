import java.util.*;

public class StockLogger {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(101.5, 102.3, 99.8);

        prices.forEach(p -> System.out.println("Price: " + p));
    }
}