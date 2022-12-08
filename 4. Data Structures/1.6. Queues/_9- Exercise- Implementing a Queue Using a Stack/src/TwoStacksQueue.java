import java.util.Stack;

public class TwoStacksQueue {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> temp = new Stack<>();

    public void enqueue(int item) {
        stack.push(item);
    }

    public int dequeue() {
        while (!stack.empty())
            temp.push(stack.pop());

        int item = temp.pop();

        while (!temp.empty())
            stack.push(temp.pop());

        return item;
    }
}
