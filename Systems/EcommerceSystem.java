import java.util.*;

class Order {
    int id;
    String name;

    Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        return o instanceof Order && this.id == ((Order)o).id;
    }

    public int hashCode() {
        return id;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1,"Phone"));
        orders.add(new Order(2,"Laptop"));
        orders.add(new Order(1,"Duplicate"));

        Set<Order> unique = new HashSet<>(orders);

        Queue<Order> queue = new LinkedList<>(unique);
        Stack<Order> failed = new Stack<>();

        while(!queue.isEmpty()) {
            Order o = queue.poll();
            if(o.id == 2) failed.push(o);
            else System.out.println("Processed: " + o);
        }

        while(!failed.isEmpty()) {
            System.out.println("Retry: " + failed.pop());
        }
    }
}