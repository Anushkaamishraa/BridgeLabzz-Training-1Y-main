import java.util.*;

public class FeedbackSystem {
    public static void main(String[] args) {

        List<String> feedbacks = new ArrayList<>();
        feedbacks.add("Good");
        feedbacks.add("Bad");
        feedbacks.add("Good");

        Set<String> unique = new HashSet<>(feedbacks);

        Queue<String> queue = new LinkedList<>(unique);
        Stack<String> stack = new Stack<>();

        while (!queue.isEmpty()) {
            String f = queue.poll();
            System.out.println("Processing: " + f);
            stack.push(f);
        }

        System.out.println("Recent Feedback:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}