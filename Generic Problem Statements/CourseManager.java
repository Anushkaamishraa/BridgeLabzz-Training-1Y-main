import java.util.*;

abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    T type;

    Course(T type) {
        this.type = type;
    }
}

public class CourseManager {

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        List<ExamCourse> exams = Arrays.asList(new ExamCourse(), new ExamCourse());
        List<AssignmentCourse> assignments = Arrays.asList(new AssignmentCourse());

        displayCourses(exams);
        displayCourses(assignments);
    }
}