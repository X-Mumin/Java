public class Main {

    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        for (Object current : list) {
            System.out.println(current);
        }
    }
}
