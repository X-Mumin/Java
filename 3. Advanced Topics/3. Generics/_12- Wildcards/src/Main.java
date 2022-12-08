public class Main {
    public static void main(String[] args) {
        User user = new Instructor(10);

        GenericList<Instructor> instructors = new GenericList<Instructor>();

        Utils.readUser(new GenericList<Instructor>());


    }
}