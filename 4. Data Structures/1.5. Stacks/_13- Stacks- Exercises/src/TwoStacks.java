import java.util.Arrays;
import java.util.EmptyStackException;

public class TwoStacks {
    private int[] items;
    private int top1;
    private int top2;
    private int size1;
    private int size2;

    public TwoStacks(int size1, int size2) {
        items = new int[size1 + size2];
        top2 = size1;
        this.size1 = size1;
        this.size2 = size2;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, 0, items.length));
    }

    public void push1(int item) {
        if (isFull1())
            throw new StackOverflowError();

        items[top1++] = item;
    }

    public void push2(int item) {
        if (isFull2())
            throw new StackOverflowError();

        items[top2++] = item;
    }

    public int pop1() {
        if (isEmpty1())
            throw new EmptyStackException();

        int pop1 = items[--top1];
        items[top1] = -1;
        return pop1;
    }

    public int pop2() {
        if (isEmpty2())
            throw new EmptyStackException();

        int pop2 = items[--top2];
        items[top2] = -1;
        return pop2;
    }

    public int peek1() {
        if (isEmpty1())
            throw new EmptyStackException();

        return items[top1 - 1];
    }

    public int peek2() {
        if (isEmpty2())
            throw new EmptyStackException();

        return items[top2 - 1];
    }

    public boolean isEmpty1() {
        return top1 == 0;
    }

    public boolean isEmpty2() {
        return top2 == size1;
    }

    public boolean isFull1() {
        return top1 == size1;
    }

    public boolean isFull2() {
        return top2 == (size1 + size2);
    }
}
