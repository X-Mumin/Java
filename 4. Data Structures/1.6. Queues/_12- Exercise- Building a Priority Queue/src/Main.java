public class Main {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        queue.enqueue(1);
        queue.enqueue(7);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(5);

        while (!queue.isEmpty())
            System.out.println(queue.dequeue());
    }
}