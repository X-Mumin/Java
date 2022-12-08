import java.util.ArrayList;
import java.util.Iterator;

public class GenericList<T>  {
    public T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
