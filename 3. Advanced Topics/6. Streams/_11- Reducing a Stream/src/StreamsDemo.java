import java.util.*;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies, new Movie("w", 10), new Movie("b", 15),
                new Movie("x", -25), new Movie("a", 15), new Movie("c", 10));

        System.out.println(movies.stream()
                .map(Movie::getLikes)
                .reduce(Integer::sum)
                .orElse(3));

        System.out.println(movies.stream()
                .map(Movie::getLikes)
                .reduce(3, Integer::sum));
    }
}
