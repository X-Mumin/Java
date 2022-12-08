import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies, new Movie("a", 10), new Movie("b", 15),
                new Movie("c", 25), new Movie("d", 4), new Movie("e", 8),
                new Movie("f", 12), new Movie("g", 8), new Movie("h", 7));

        // 8 movies
        // 2 movies per page

        // interested in 3rd page!
        // skip(3) = skip ((page - 1) * pageSize)
        // limit(2) = limit(pageSize)
        int pageSize = 2;
        int page = 3;

        // return interested page as list?
        // validation on required page?
        // if title is empty -> not be returned to the list.
        
        movies.stream()
                .skip((page - 1) * pageSize)
                .limit(pageSize)
                .forEach(movie -> System.out.println(movie.getTitles()));
    }
}
