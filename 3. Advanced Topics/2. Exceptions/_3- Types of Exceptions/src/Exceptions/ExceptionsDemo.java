package Exceptions;

import java.io.FileReader;

public class ExceptionsDemo {
    public static void show() {
        sayHello(null);
    }
    public static void sayHello(String name) {
        FileReader fileReader = new FileReader("file.txt");
        System.out.println(name.toUpperCase());
    }
}
