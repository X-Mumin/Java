public class LambdaDemo {
    public LambdaDemo(String message) {
        System.out.println(message);
    }

    public void print(String message) {
        System.out.println(message);
    }
    public static void show() {
        // Class/Object::method  *** "WITHOUT ()" ***
//        greet(System.out::println);
//        greet(new LambdaDemo()::print);
        greet(LambdaDemo::new);
    }
    public static void greet(Printer printer) {
        printer.print("Hello World!");
    }
}
