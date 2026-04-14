import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();

        map.put("Aman", 80.0);
        map.put("Riya", 90.0);

        map.put("Aman", 85.0);

        map.remove("Riya");

        for (Map.Entry<String, Double> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}