import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n = 2;

        ListIterator<String> fast = list.listIterator();
        ListIterator<String> slow = list.listIterator();

        for (int i = 0; i < n; i++) fast.next();

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        System.out.println(slow.next());
    }
}