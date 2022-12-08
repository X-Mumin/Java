import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(2, "Mu'min");
        map.put(5, "Ahmad");
        map.put(null, "Ali");
        System.out.println(map);

        map.put(null, null);
        System.out.println(map);

        map.remove(null);
        System.out.println(map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print(entry.hashCode());
            System.out.print("\t:\t");
            System.out.print(entry.getKey());
            System.out.print("\t:\t");
            System.out.print(entry.getValue());
            System.out.print("\t:\t");
            System.out.println(entry);
        }
    }
}