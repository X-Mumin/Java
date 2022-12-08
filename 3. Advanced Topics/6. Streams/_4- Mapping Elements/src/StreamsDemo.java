import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies, new Movie("a", 10), new Movie("b", 15),
                new Movie("c", 25));

        //  # of likes are strings ---> convert to "int"

        movies.stream()
                .mapToInt(Movie::getLikes)  // "Movie "a" + likes: 10"
                .forEach(System.out::println);

        Supplier<Stream<List<Integer>>> streamSupplier = () -> Stream.of(
                Stream.of(1, 2, 3)
                        .collect(Collectors.toList()), Stream.of(4, 5, 6)
                        .collect(Collectors.toList()));

        streamSupplier.get()
                .forEach(System.out::println);

        streamSupplier.get()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
