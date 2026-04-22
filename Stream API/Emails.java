import java.util.*;

public class Emails {
    public static void sendEmailNotification(String email) {
        System.out.println("Email sent to: " + email);
    }

    public static void main(String[] args) {

        List<String> emails = Arrays.asList("a@gmail.com", "b@gmail.com");

        emails.forEach(Emails::sendEmailNotification);
    }
}