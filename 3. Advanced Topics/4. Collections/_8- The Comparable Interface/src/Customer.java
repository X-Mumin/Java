public class Customer implements Comparable<Customer> {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }
}
