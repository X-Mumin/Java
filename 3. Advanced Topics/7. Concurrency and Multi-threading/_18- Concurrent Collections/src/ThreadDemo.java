import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo {
    public static void show() {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        Thread thread1 = new Thread(() -> {
            map.put(1, "a");
            map.put(3, "b");
            map.put(5, "c");
        });

        Thread thread2 = new Thread(() -> {
            map.put(2, "x");
            map.put(4, "y");
            map.put(6, "z");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(map);
    }
}
