import java.util.*;

class PackageItem {
    String id;

    PackageItem(String id) {
        this.id = id;
    }

    public String toString() {
        return id;
    }
}

public class WarehouseSystem {
    public static void main(String[] args) {

        Queue<PackageItem> pending = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<PackageItem> delivered = new ArrayList<>();
        Stack<PackageItem> returned = new Stack<>();

        PackageItem p1 = new PackageItem("P1");
        PackageItem p2 = new PackageItem("P2");

        if (ids.add(p1.id)) pending.add(p1);
        if (ids.add(p2.id)) pending.add(p2);

        while (!pending.isEmpty()) {
            PackageItem p = pending.poll();
            if (p.id.equals("P2")) {
                returned.push(p);
            } else {
                delivered.add(p);
            }
        }

        System.out.println("Delivered: " + delivered);
        System.out.println("Returned: " + returned);
    }
}