package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show() {
        sayHello();
    }

    public static void sayHello() {
        try {
            FileReader fileReader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
//            e.getMessage();
            e.printStackTrace();
//            e.getLocalizedMessage();
//            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }
}
