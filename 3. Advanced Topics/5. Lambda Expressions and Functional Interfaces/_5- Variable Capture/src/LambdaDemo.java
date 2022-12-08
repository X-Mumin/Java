public class LambdaDemo {
//    public String prefix = "- ";

    public void show() {
        String prefix = "- ";
//        greet(message -> System.out.println(this.prefix + message));
        greet(message -> System.out.println(prefix + message));

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
