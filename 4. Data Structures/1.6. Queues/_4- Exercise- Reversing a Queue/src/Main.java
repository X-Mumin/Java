import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        System.out.println(deque);
        reverse(deque);
        System.out.println(deque);
    }

    public static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty())
            throw new IllegalStateException();

        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());

//        for (int i=0; i<queue.size(); i++) {
//            System.out.println(queue.peek());
//            queue.add(queue.remove());
//            System.out.println(queue);
//        }
    }
}