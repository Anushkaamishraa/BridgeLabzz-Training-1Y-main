import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {

        List<String> alerts = Arrays.asList(
                "Emergency Alert",
                "Discount Offer",
                "Medical Reminder"
        );

        Predicate<String> importantOnly = msg -> msg.contains("Emergency");

        alerts.stream()
                .filter(importantOnly)
                .forEach(System.out::println);
    }
}