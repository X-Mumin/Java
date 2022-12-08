import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int count;


    public ArrayQueue(int size) {
        this.queue = new int[size];
    }

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException();

        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        int item = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return item;
    }

    public int peek() {
        return queue[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return (count == queue.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
