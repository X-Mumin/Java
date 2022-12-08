import java.util.*;

public class MapDemo {

    public static void show() {
        List<Customer> customers = new ArrayList<>();

        for(Customer customer : customers) {
            if(customer.getEmail() == "e1")
                System.out.println("Found!");
        }

        // Need of HashTables / HashMaps as the other DS make the lookup
        // process unscalable.
    }
}
