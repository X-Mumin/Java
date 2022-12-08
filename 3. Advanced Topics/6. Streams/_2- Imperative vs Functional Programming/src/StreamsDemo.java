import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies, new Movie("a", 10), new Movie("b", 15),
                new Movie("c", 20), new Movie("d", 25));

        // Imperative
        int imperativeCount = 0;
        for (Movie movie : movies) {
            if (movie.getLikes() > 10)
                imperativeCount++;
        }
        System.out.println(imperativeCount);

        // Declarative
        System.out.println(
                movies.stream().filter(movie -> movie.getLikes() > 10).count());
    }
}
