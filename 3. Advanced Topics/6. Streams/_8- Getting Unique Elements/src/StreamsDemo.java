import java.util.*;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies, new Movie("w", 10), new Movie("y", 15),
                new Movie("x", 25), new Movie("y", 15), new Movie("w", 10));

        movies.stream()
                .map(Movie::getTitle)
                .distinct()
                .forEach(System.out::println);
    }
}
