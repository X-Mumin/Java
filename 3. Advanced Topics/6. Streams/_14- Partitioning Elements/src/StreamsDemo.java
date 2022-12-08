import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies, new Movie("w", 10, Genre.COMEDY),
                new Movie("b", 15, Genre.COMEDY),
                new Movie("x", 25, Genre.THRILLER),
                new Movie("a", 15, Genre.ACTION),
                new Movie("c", 10, Genre.ACTION));

        Map<Boolean, List<String>> map = movies.stream()
                .collect(Collectors.partitioningBy(
                        movie -> movie.getLikes() > 10,
                        Collectors.mapping(Movie::getTitle,
                                Collectors.toList())));

        System.out.println(map);
    }
}
