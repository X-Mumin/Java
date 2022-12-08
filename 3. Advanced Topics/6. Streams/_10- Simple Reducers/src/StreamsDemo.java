import java.util.*;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies, new Movie("w", 10), new Movie("b", 15),
                new Movie("x", 25), new Movie("a", 25), new Movie("c", 10));

        System.out.println(movies.stream()
                .anyMatch(movie -> movie.getLikes() > 20)); // all .. none

        System.out.println(movies.stream()
                .findFirst()
                .get()
                .getTitle());
        System.out.println(movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .findAny()
                .get()
                .getTitle());
        System.out.println(movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get()
                .getTitle());

        // return all max values?
    }
}
