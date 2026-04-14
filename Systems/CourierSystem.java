import java.util.*;

class Parcel {
    String id;
    int priority;

    Parcel(String i, int p) {
        id = i;
        priority = p;
    }

    public String toString() {
        return id;
    }
}

public class CourierSystem {
    public static void main(String[] args) {

        PriorityQueue<Parcel> pq =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);

        Queue<Parcel> normal = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();

        Parcel p1 = new Parcel("P1", 5);
        Parcel p2 = new Parcel("P2", 1);

        if (ids.add(p1.id)) pq.add(p1);
        if (ids.add(p2.id)) normal.add(p2);

        while (!pq.isEmpty()) {
            completed.add(pq.poll());
        }

        while (!normal.isEmpty()) {
            completed.add(normal.poll());
        }

        System.out.println("Completed: " + completed);
    }
}