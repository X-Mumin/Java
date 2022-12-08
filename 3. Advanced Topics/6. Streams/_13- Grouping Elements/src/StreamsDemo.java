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

        Map<Genre, List<Movie>> map1 = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(map1);

        Map<Genre, Long> map2 = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre,
                        Collectors.counting()));
        System.out.println(map2);

        Map<Genre, List<String>> map3 = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre,
                        Collectors.mapping(Movie::getTitle,
                                Collectors.toList())));
        System.out.println(map3);
    }
}
