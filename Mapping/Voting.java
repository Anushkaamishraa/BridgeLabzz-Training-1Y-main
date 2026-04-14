import java.util.*;

public class Voting {
    public static void main(String[] args) {
        String[] votes = {"A", "B", "A", "C", "A", "B", "C", "A", "B", "B"};

        Map<String, Integer> map = new HashMap<>();

        for (String v : votes) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        String winner = null;
        int max = 0;

        for (String k : map.keySet()) {
            if (map.get(k) > max) {
                max = map.get(k);
                winner = k;
            }
        }

        System.out.println(map);
        System.out.println("Winner: " + winner);
    }
}