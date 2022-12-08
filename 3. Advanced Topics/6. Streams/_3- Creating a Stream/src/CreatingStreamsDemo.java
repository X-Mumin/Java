import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamsDemo {

    public static void show() {
        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers).forEach(number -> System.out.println(number));

        // round n numbers of digits
        Stream.generate(() -> Math.random()).limit(3).forEach(
                System.out::println);

        Stream.iterate(10, n -> n+1).limit(3).forEach(System.out::println);
    }
}
