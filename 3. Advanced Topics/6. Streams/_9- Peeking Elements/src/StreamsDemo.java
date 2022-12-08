import java.util.*;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies, new Movie("w", 10), new Movie("b", 15),
                new Movie("x", 25), new Movie("a", 15), new Movie("c", 10));

        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .peek(movie -> System.out.println("filtered: " + movie.getTitle()))
                .map(Movie::getTitle)
                .peek(movie -> System.out.println("mapped: " + movie))
                .forEach(movie -> System.out.println("result: " + movie));
    }
}
