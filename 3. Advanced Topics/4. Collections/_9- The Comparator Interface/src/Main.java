import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        Collections.addAll(customers, new Customer("b",
                        "e3"), new Customer("a", "e2"),
                new Customer("c", "e1"));

        Collections.sort(customers);
        System.out.println(customers);

        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}