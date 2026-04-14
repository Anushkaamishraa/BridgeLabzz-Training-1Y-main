import java.util.*;

public class CourseReg {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("CS101", 60);
        map.put("CS102", 3);

        map.put("CS101", map.get("CS101") + 1);
        map.put("CS102", map.get("CS102") - 1);

        for (String c : map.keySet()) {
            if (map.get(c) >= 50)
                System.out.println("Full: " + c);
            else if (map.get(c) < 5)
                System.out.println("Low: " + c);
        }
    }
}