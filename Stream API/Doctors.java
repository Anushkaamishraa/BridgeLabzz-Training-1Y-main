import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean availableWeekend;

    Doctor(String name, String specialty, boolean availableWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableWeekend = availableWeekend;
    }
}

public class Doctors {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr A", "Cardio", true),
                new Doctor("Dr B", "Neuro", false),
                new Doctor("Dr C", "Ortho", true)
        );

        doctors.stream()
                .filter(d -> d.availableWeekend)
                .sorted((a, b) -> a.specialty.compareTo(b.specialty))
                .forEach(d -> System.out.println(d.name + " " + d.specialty));
    }
}