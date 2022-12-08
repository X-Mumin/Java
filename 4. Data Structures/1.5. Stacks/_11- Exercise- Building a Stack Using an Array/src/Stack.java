import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private int[] array;
    private int top;

    public Stack(int size) {
        array = new int[size];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(array, 0, top));
    }

    public void push(int item) {
        if (top == array.length)
            throw new StackOverflowError();

        array[top++] = item;
    }

    public int pop() {
        if (isEmpty())
            throw new EmptyStackException();

        return array[--top];
    }

    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();

        return array[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
