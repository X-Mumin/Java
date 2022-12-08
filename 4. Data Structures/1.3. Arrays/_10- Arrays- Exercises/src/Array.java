import java.util.Arrays;
import java.util.stream.IntStream;

public class Array {
    private int[] array;
    private int count;

    public Array(int size) {
        this.array = new int[size];
    }

    public void print() {
        Arrays.stream(array, 0, count)
              .forEach(System.out::println);
    }

    public void insert(int item) {
        if (count == array.length) {
            int[] temp = new int[array.length * 2];
            System.arraycopy(array, 0, temp, 0, count);
            array = temp;
        }

        array[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        System.arraycopy(array, index + 1, array, index, count - index);
        count--;
    }

    public void remove(int item) {
        int index = indexOf(item);

        System.arraycopy(array, index + 1, array, index, count - index);
        count--;
    }

    public int indexOf(int item) {

        return IntStream.range(0, count)
                        .filter(i -> array[i] == item)
                        .findFirst()
                        .orElse(-1);

    }

    public int max() {
        int max = array[0];

        for (int i = 1; i < count; i++)
            if (array[i] > max)
                max = array[i];

        return max;
    }

    public Array intersect(Array array) {
        Array smaller = (this.count < array.count) ? this : array;
        Array bigger = (this.count > array.count) ? this : array;

        Array intersection = new Array(smaller.count);

        for (int i = 0; i < smaller.count; i++)
            for (int j = 0; j < bigger.count; j++)
                if (smaller.array[i] == bigger.array[j])
                    intersection.insert(smaller.array[i]);

        return intersection;
    }

    public void reverse() {
        int temp;
        for (int i = 0; i < (count / 2); i++) {
            temp = array[i];
            array[i] = array[count-1 - i];
            array[count-1 - i] = temp;
        }
    }

    public void insertAt(int item, int index) {
        if (index > count)
            throw new IllegalArgumentException();

        if (index == count) {
            insert(item);
            return;
        }

        System.arraycopy(array, index, array, index+1, count-index);
        array[index] = item;
        count++;
    }
}
