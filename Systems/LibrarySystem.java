import java.util.*;

class Book {
    String name;

    Book(String n) {
        name = n;
    }

    public String toString() {
        return name;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Java"));
        books.add(new Book("Python"));

        Set<String> members = new HashSet<>();
        members.add("M1");
        members.add("M2");

        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returnedStack = new Stack<>();

        issueQueue.add(books.get(0));
        issueQueue.add(books.get(1));

        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.poll();
            System.out.println("Issued: " + b);
            returnedStack.push(b);
        }

        System.out.println("Re-issue recent: " + returnedStack.pop());
    }
}