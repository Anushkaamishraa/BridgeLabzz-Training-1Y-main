import java.time.*;
import java.util.*;

class Policy implements Comparable<Policy> {
    String policyNumber;
    String name;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    Policy(String p, String n, LocalDate e, String c, double pr) {
        policyNumber = p;
        name = n;
        expiryDate = e;
        coverageType = c;
        premium = pr;
    }

    public String toString() {
        return policyNumber + " | " + name + " | " + expiryDate + " | " + coverageType + " | " + premium;
    }

    // for HashSet uniqueness (based on policy number)
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return policyNumber.equals(p.policyNumber);
    }

    public int hashCode() {
        return policyNumber.hashCode();
    }

    // for TreeSet sorting (by expiry date)
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }
}

public class InsuranceSystem {

    static void display(Set<Policy> set) {
        for (Policy p : set) System.out.println(p);
    }

    static void expiringSoon(Set<Policy> set) {
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);

        System.out.println("Expiring Soon:");
        for (Policy p : set) {
            if (p.expiryDate.isAfter(now) && p.expiryDate.isBefore(limit)) {
                System.out.println(p);
            }
        }
    }

    static void byCoverage(Set<Policy> set, String type) {
        System.out.println("Coverage Type: " + type);
        for (Policy p : set) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    static void findDuplicates(List<Policy> list) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (Policy p : list) {
            if (!seen.add(p.policyNumber)) {
                duplicates.add(p.policyNumber);
            }
        }

        System.out.println("Duplicate Policy Numbers: " + duplicates);
    }

    static void performanceTest(Set<Policy> set, List<Policy> data) {
        long start, end;

        start = System.nanoTime();
        for (Policy p : data) set.add(p);
        end = System.nanoTime();
        System.out.println("Add Time: " + (end - start));

        start = System.nanoTime();
        set.contains(data.get(0));
        end = System.nanoTime();
        System.out.println("Search Time: " + (end - start));

        start = System.nanoTime();
        set.remove(data.get(0));
        end = System.nanoTime();
        System.out.println("Remove Time: " + (end - start));
    }

    public static void main(String[] args) {

        List<Policy> list = Arrays.asList(
                new Policy("P1", "Aman", LocalDate.now().plusDays(10), "Health", 5000),
                new Policy("P2", "Riya", LocalDate.now().plusDays(40), "Auto", 7000),
                new Policy("P3", "Karan", LocalDate.now().plusDays(20), "Home", 6000),
                new Policy("P1", "Duplicate", LocalDate.now().plusDays(15), "Health", 5000)
        );

        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        hashSet.addAll(list);
        linkedSet.addAll(list);
        treeSet.addAll(list);

        System.out.println("HashSet:");
        display(hashSet);

        System.out.println("\nLinkedHashSet:");
        display(linkedSet);

        System.out.println("\nTreeSet (Sorted by Expiry):");
        display(treeSet);

        expiringSoon(hashSet);

        byCoverage(hashSet, "Health");

        findDuplicates(list);

        System.out.println("\nPerformance HashSet:");
        performanceTest(new HashSet<>(), list);

        System.out.println("\nPerformance LinkedHashSet:");
        performanceTest(new LinkedHashSet<>(), list);

        System.out.println("\nPerformance TreeSet:");
        performanceTest(new TreeSet<>(), list);
    }
}