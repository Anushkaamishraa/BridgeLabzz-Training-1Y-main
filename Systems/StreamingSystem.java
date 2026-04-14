import java.util.*;

class Movie {
    String name, genre;

    Movie(String n, String g) {
        name = n;
        genre = g;
    }

    public String toString() {
        return name;
    }
}

public class StreamingSystem {
    public static void main(String[] args) {

        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie("A", "Action"));
        allMovies.add(new Movie("B", "Comedy"));

        Stack<Movie> history = new Stack<>();
        Queue<Movie> upNext = new LinkedList<>();
        Set<String> genres = new HashSet<>();

        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(1));

        while (!upNext.isEmpty()) {
            Movie m = upNext.poll();
            history.push(m);
            genres.add(m.genre);
            System.out.println("Watched: " + m);
        }

        System.out.println("Genres Watched: " + genres);
    }
}