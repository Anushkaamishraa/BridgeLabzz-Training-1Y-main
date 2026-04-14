import java.util.*;

class Patient {
    String name;

    Patient(String n) {
        name = n;
    }

    public boolean equals(Object o) {
        return o instanceof Patient && name.equals(((Patient)o).name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {

        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> queue = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        Patient p1 = new Patient("Aman");
        Patient p2 = new Patient("Riya");

        admitted.add(p1);
        admitted.add(p2);

        queue.add(p1);
        queue.add(p2);

        while (!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println("Treating: " + p);
            discharged.push(p);
            history.add(p);
        }

        System.out.println("Re-admit: " + discharged.pop());
    }
}