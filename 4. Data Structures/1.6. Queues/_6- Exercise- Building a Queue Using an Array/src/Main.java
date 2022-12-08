public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.print(queue.peek());
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        System.out.print(queue.peek());
        System.out.println(queue);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        System.out.print(queue.peek());
        System.out.println(queue);
    }
}