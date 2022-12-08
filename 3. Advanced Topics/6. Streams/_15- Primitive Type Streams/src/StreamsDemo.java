import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsDemo {

    public static void show() {
        System.out.println(IntStream.range(1, 5).boxed().collect(
                Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(
                Collectors.toList()));

        List<Integer> integers = IntStream.rangeClosed(1, 5).boxed().collect(
                Collectors.toList());
    }
}