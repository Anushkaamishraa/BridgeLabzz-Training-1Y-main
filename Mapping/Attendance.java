import java.util.*;

public class Attendance {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        String[] students = {"A", "B", "C", "D", "E"};

        for (String s : students) map.put(s, 0);

        map.put("A", map.get("A") + 10);
        map.put("B", map.get("B") + 5);

        for (String s : map.keySet()) {
            if (map.get(s) < 10)
                System.out.println("Low attendance: " + s);
        }
    }
}