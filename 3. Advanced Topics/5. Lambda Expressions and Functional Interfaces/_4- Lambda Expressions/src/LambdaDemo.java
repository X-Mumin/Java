public class LambdaDemo {
    public static void show() {
        Printer printer = message -> System.out.println(message);
        greet(printer);

        /*
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
        */
    }
    public static void greet(Printer printer) {
        printer.print("Hello World!");
    }
}
