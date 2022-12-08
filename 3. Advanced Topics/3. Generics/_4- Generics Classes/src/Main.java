public class Main {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<Integer>();
        list.add("1");
        list.add(new User());
        // compile time type safety

        list.add(1);

        list.get(0);
    }
}