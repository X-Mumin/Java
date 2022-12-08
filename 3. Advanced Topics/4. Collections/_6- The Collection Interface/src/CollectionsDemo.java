import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        Collections.addAll(collection, "x", "y", "z");

//        for (String item : collection) {
//            System.out.println(item);
//        }

        Object[] objectArray = collection.toArray();
        String[] stringArray = collection.toArray(new String[0]);
        stringArray[0].toUpperCase();

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other);
        System.out.println(collection.equals(other));

        System.out.println(collection + ", size: " + collection.size());

        collection.remove("x");
        System.out.println(collection + ", size: " + collection.size());

        System.out.println("ContainsX? -> " + collection.contains("x"));
        System.out.println("ContainsA? -> " + collection.contains("a"));

        collection.clear();
        System.out.println(collection + ", Empty? -> " + collection.isEmpty());

    }
}
