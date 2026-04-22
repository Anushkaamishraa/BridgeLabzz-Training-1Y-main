import java.util.*;

public class UppercaseNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john", "alice", "bob");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}