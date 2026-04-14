import java.util.*;

public class ExamResults {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> data = new HashMap<>();

        Map<String, Integer> math = new HashMap<>();
        math.put("Aman", 85);
        math.put("Riya", 92);
        math.put("Karan", 78);

        Map<String, Integer> science = new HashMap<>();
        science.put("Aman", 88);
        science.put("Riya", 95);
        science.put("Karan", 91);

        data.put("Math", math);
        data.put("Science", science);

        for (String subject : data.keySet()) {

            Map<String, Integer> students = data.get(subject);

            String topper = "";
            int max = 0;
            int sum = 0;

            for (Map.Entry<String, Integer> e : students.entrySet()) {
                int marks = e.getValue();
                sum += marks;

                if (marks > max) {
                    max = marks;
                    topper = e.getKey();
                }
            }

            double avg = sum / (double) students.size();

            System.out.println(subject + " Topper: " + topper);
            System.out.println(subject + " Average: " + avg);

            for (int m : students.values()) {
                if (m > 90) {
                    System.out.println(subject + " has student > 90");
                    break;
                }
            }
        }
    }
}