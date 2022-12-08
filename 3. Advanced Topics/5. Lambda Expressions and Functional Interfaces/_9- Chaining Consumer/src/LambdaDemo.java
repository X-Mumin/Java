import com.sun.deploy.ui.DialogTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");

        Consumer<String> print = System.out::println;
        Consumer<String> printUpperCase =
                item -> System.out.println(item.toUpperCase());
        Consumer<String> mask = item -> System.out.println("?");

        list.forEach(print.andThen(printUpperCase.andThen(mask)));
    }
}
