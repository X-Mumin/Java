import java.time.Duration;
import java.time.LocalTime;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // [10, 20, 30, 40, 50]
        LocalTime start = LocalTime.now();
        TwoStacksQueue queue = new TwoStacksQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.dequeue());
        System.out.println(Duration.between(start, LocalTime.now()).toMillis());


        start = LocalTime.now();
        QueueWithTwoStacks que = new QueueWithTwoStacks();

        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.enqueue(50);

        System.out.println(que.dequeue());
        System.out.println(Duration.between(start, LocalTime.now()).toMillis());
    }
}
