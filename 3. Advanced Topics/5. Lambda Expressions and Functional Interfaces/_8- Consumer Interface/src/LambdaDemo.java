import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaDemo {
    public static void show() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3);

        list.forEach(System.out::println);
    }
}
