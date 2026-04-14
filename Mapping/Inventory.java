import java.util.*;

public class Inventory {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Pen", 10);
        map.put("Book", 5);

        map.put("Pen", map.get("Pen") - 10);

        if (map.get("Pen") <= 0) map.put("Pen", 0);

        map.put("Book", map.get("Book") + 5);

        System.out.println(map.getOrDefault("Pen", 0));

        for (String k : map.keySet()) {
            if (map.get(k) == 0)
                System.out.println("Out of stock: " + k);
        }
    }
}