import java.util.*;

public class Salary {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("A", 50000.0);
        map.put("B", 60000.0);

        map.put("A", map.get("A") * 1.1);

        double sum = 0;
        double max = 0;
        String maxEmp = "";

        for (String k : map.keySet()) {
            double sal = map.get(k);
            sum += sal;

            if (sal > max) {
                max = sal;
                maxEmp = k;
            }
        }

        System.out.println("Avg: " + sum / map.size());
        System.out.println("Highest: " + maxEmp);
    }
}