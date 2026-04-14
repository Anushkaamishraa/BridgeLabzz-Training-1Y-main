import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    public int compareTo(Student s) {
        return s.marks - this.marks;
    }

    public boolean equals(Object o) {
        return o instanceof Student && name.equals(((Student)o).name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name + " " + marks;
    }
}

public class AdmissionSystem {
    public static void main(String[] args) {

        List<Student> applicants = new ArrayList<>();
        applicants.add(new Student("Aman", 80));
        applicants.add(new Student("Riya", 90));

        Set<Student> shortlisted = new HashSet<>(applicants);

        Queue<Student> interviewQueue = new LinkedList<>(shortlisted);

        TreeSet<Student> meritList = new TreeSet<>();

        while (!interviewQueue.isEmpty()) {
            Student s = interviewQueue.poll();
            meritList.add(s);
        }

        System.out.println("Merit List:");
        System.out.println(meritList);
    }
}