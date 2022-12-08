import java.util.*;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = new ArrayList<>();
        Collections.addAll(movies, new Movie("a", 10), new Movie("y", 15),
                new Movie("x", 25), new Movie("d", 4), new Movie("w", 8),
                new Movie("f", 12), new Movie("g", 8), new Movie("b", 7));

        movies
                .stream()
//                .sorted((a,b) -> a.getTitle().compareTo(b.getTitle()))
                .sorted(Comparator.comparing(Movie::getLikes).reversed())
                .forEach(x -> System.out.println(x.getLikes()));

        // return the result as list.
    }
}
