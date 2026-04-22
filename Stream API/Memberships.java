import java.time.*;
import java.util.*;

class Member {
    String name;
    LocalDate expiry;

    Member(String name, LocalDate expiry) {
        this.name = name;
        this.expiry = expiry;
    }
}

public class Memberships {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("John", LocalDate.now().plusDays(10)),
                new Member("Alice", LocalDate.now().plusDays(40)),
                new Member("Bob", LocalDate.now().plusDays(20))
        );

        members.stream()
                .filter(m -> m.expiry.isBefore(LocalDate.now().plusDays(30)))
                .forEach(m -> System.out.println(m.name));
    }
}