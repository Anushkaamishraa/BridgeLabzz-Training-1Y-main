import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("India", "Delhi");
        map.put("USA", "Washington");

        String input = "India";

        System.out.println(map.getOrDefault(input, "Unknown"));
        
        for (Map.Entry<String, String> e : map.entrySet())
            System.out.println(e);
    }
}