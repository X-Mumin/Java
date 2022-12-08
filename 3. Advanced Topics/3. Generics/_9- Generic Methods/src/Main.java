public class Main {
    public static void main(String[] args) {
        User user1 = new User(10);
        User user2 = new User(20);

        System.out.println(user1.compareTo(user2));
        System.out.println(Utils.max(1, 3));
        System.out.println(Utils.max(user1, user2));
    }
}