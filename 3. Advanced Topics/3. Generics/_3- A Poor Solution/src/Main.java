public class Main {
    public static void main(String[] args) {
        List list = new List();

        list.add(Integer.valueOf(1));
        list.add(String.valueOf('1'));
        list.add(new User());

        int number = (int) list.get(1);
    }
}