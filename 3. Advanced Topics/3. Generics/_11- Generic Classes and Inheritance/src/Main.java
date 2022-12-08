public class Main {
    public static void main(String[] args) {
        User user = new Instructor(10);

        Utils.printUser(new Instructor(30));

        GenericList<User> users = new GenericList<Instructor>();
        // GL<Instrucor> is not a subclass of GL<User> as they are the same
        // class with different T type ~~~ different types.

        GenericList<Instructor> instructors = new GenericList<Instructor>();
        GenericList<User> users = new GenericList<User>();
        // iterate over the GL<Instructor> and put every instructor in
        // corresponding to user in the list of users which is tedious.
        Utils.printUsers(users);
    }
}