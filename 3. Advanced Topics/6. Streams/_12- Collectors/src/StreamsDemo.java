import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies, new Movie("w", 10), new Movie("b", 15),
                new Movie("x", 25), new Movie("a", 15), new Movie("c", 10));

        System.out.println(movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, movie -> movie)));

        System.out.println(movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle,
                        Function.identity())));

        System.out.println(movies.stream()
                .collect(Collectors.summingInt(Movie::getLikes)));
        System.out.println((Integer) movies.stream()
                .mapToInt(Movie::getLikes)
                .sum());
        // in case of large dataset >>> summingInt vs reduce()/mapToInt.sum()

        System.out.println(movies.stream()
                .collect(Collectors.summarizingInt(Movie::getLikes)));

        System.out.println(movies.stream()
                        .map(Movie::getTitle)
                .collect(Collectors.joining(", ")));
    }
}
