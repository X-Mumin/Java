import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void show() {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        list.add(0, "!");
        Collections.addAll(list, "a", "x", "y", "z", "a");

        System.out.println(list);
        System.out.println(list.get(0));
        list.set(1, "a+");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        System.out.println(list.lastIndexOf("a"));
        System.out.println(list.subList(1, 3));
    }
}
