import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies, new Movie("a", 10), new Movie("b", 15),
                new Movie("c", 25));

        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;

        movies.stream()
                .filter(isPopular)
                .forEach(x -> System.out.println(x.getTitles()));
    }
}
