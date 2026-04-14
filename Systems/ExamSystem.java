import java.util.*;

class Question {
    String q;
    Question(String q){ this.q=q; }
    public String toString(){ return q; }
}

class Student {
    String id;
    Student(String id){ this.id=id; }
}

public class ExamSystem {
    public static void main(String[] args) {

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Q1"));
        questions.add(new Question("Q2"));

        Collections.shuffle(questions);

        Set<String> students = new HashSet<>();
        students.add("S1");
        students.add("S2");

        Queue<Student> queue = new LinkedList<>();
        queue.add(new Student("S1"));
        queue.add(new Student("S2"));

        Stack<Question> stack = new Stack<>();

        while(!queue.isEmpty()) {
            Student s = queue.poll();
            System.out.println("Serving: " + s.id);

            for(Question q: questions) {
                stack.push(q);
                System.out.println("Question: " + q);
            }
        }
    }
}