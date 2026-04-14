import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            result.putIfAbsent(entry.getValue(), new ArrayList<>());
            result.get(entry.getValue()).add(entry.getKey());
        }

        System.out.println(result);
    }
}