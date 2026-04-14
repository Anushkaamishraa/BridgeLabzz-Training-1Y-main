import java.util.*;

public class Website {
    public static void main(String[] args) {
        String[] pages = {"home", "about", "products", "home", "products", "contact", "home"};

        Map<String, Integer> map = new HashMap<>();

        for (String p : pages) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println(list);
        System.out.println("Top: " + list.get(0).getKey());
    }
}