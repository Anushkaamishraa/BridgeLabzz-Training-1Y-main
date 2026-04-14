import java.util.*;

class RideRequest {
    String name;
    int priority;

    RideRequest(String n,int p){ name=n; priority=p; }
}

class Driver {
    String name;
    Driver(String n){ name=n; }
}

class Ride {
    String details;
    Ride(String d){ details=d; }
}

public class RideSystem {
    public static void main(String[] args) {

        PriorityQueue<RideRequest> pq =
                new PriorityQueue<>((a,b)->b.priority-a.priority);

        pq.add(new RideRequest("A",5));
        pq.add(new RideRequest("B",2));

        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver("D1"));

        List<Ride> history = new ArrayList<>();

        while(!pq.isEmpty()) {
            RideRequest r = pq.poll();
            System.out.println("Assigned: " + r.name);
            history.add(new Ride(r.name));
        }
    }
}