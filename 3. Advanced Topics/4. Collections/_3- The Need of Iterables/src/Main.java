public class Main {

    public static void main(String[] args) {
        GenericList<String> list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.items[0] = "x";

        System.out.println(list.items.length);
    }
}
