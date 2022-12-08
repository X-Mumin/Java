import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> temp = new Stack<>();

    public void enqueue(int item) {
        stack.push(item);
    }

    public int dequeue() {
        if (temp.isEmpty())
            while (!stack.isEmpty())
                temp.push(stack.pop());

        return temp.pop();
    }
}
