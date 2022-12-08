import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {
    private List<Integer> queue = new ArrayList<>();
    private int size;

    public void enqueue(Integer item) {
        if (queue.isEmpty()) {
            queue.add(item);
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (queue.get(i) < item) {
                    queue.add(i + 1, item);
                    break;
                }
            }
        }
        size++;
        System.out.print(item + ":" + (size - 1) + ":");
        System.out.println(queue);
    }

    public Integer dequeue() {
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
