import java.util.*;

public class MapDemo {

    public static void show() {
        Customer c1 = new Customer("a", "e1");
        Customer c2 = new Customer("b", "e2");
        Customer c3 = new Customer("c", "e3");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c3.getEmail(), c3);
        map.put(c2.getEmail(), c2);

        Customer customer1 = map.get("e2");
        System.out.println(customer1);

        customer1 = map.get("eX");
        System.out.println(customer1);

        Customer unkown = new Customer("N/A", "N/A");
        System.out.println(map.getOrDefault("eX", unkown));
        System.out.println(map.containsKey("e10"));
        map.replace("e1", new Customer("a++", "e1"));
        System.out.println(map);

        for(String key : map.keySet())
            System.out.println(key);

        for (Map.Entry<String, Customer> entry:
             map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        for (Customer customer : map.values()) {
            System.out.println(customer);
        }
    }
}
