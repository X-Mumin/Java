import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        Collections.addAll(customers, new Customer("b"), new Customer("a"),
                new Customer("c"));

        Collections.sort(customers);

        System.out.println(customers);
    }
}