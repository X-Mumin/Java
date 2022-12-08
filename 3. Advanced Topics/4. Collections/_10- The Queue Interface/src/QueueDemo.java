import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("b");
        queue.add("a");  // throw exception

        queue.offer("d"); // return false

        System.out.println(queue);
        System.out.println(queue.peek()); // return null if queue is empty
        System.out.println(queue);
        System.out.println(queue.element()); // throw exception if queue is
        // empty
        queue.remove(); // throw exception
        System.out.println(queue);
        queue.poll(); // return null
        System.out.println(queue);
    }
}
