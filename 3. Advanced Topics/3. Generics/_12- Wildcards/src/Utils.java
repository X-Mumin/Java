public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return ((first.compareTo(second) > 0) ? first : second);
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + " = " + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    // class CAP#1 extends User {}
    // class Instructor extends User {}
    public static User readUser(GenericList<? extends User> users) {
        users.add(new User(15));

        User user = users.get(0);

        return user;
    }

    public static void addUser(GenericList<? super User> users) {
        users.add(new Instructor(15));

        //        User user = users.get(0);

        //        GenericList<Object> temp = new GenericList<>();
        Object object = users.get(0);
    }
}
