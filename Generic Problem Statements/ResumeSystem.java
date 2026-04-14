import java.util.*;

abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    T role;

    Resume(T role) {
        this.role = role;
    }
}

public class ResumeSystem {

    public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        List<SoftwareEngineer> se = Arrays.asList(new SoftwareEngineer(), new SoftwareEngineer());
        List<DataScientist> ds = Arrays.asList(new DataScientist());

        processResumes(se);
        processResumes(ds);
    }
}