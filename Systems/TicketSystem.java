import java.util.*;

class Booking {
    String user;
    int priority;

    Booking(String u, int p) {
        user = u;
        priority = p;
    }

    public String toString() {
        return user;
    }
}

public class TicketSystem {
    public static void main(String[] args) {

        Set<String> users = new HashSet<>();
        Queue<Booking> queue = new LinkedList<>();
        PriorityQueue<Booking> vip =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);
        List<Booking> confirmed = new ArrayList<>();

        if (users.add("A")) queue.add(new Booking("A", 1));
        if (users.add("B")) vip.add(new Booking("B", 5));

        while (!vip.isEmpty()) {
            confirmed.add(vip.poll());
        }

        while (!queue.isEmpty()) {
            confirmed.add(queue.poll());
        }

        System.out.println("Confirmed: " + confirmed);
    }
}