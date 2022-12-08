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
            int[] temp = new int[(int) (array.length * 1.5)];
            System.arraycopy(array, 0, temp, 0, count);
            array = temp;
        }

        array[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        //        for (int i = index; i < count; i++)
        //            array[i] = array[i + 1];

        System.arraycopy(array, index + 1, array, index, count - index);
        count--;
    }

    public int indexOf(int item) {

        //        for (int i = 0; i < count; i++) {
        //            if (array[i] == item) {
        //                return i;
        //            }
        //        }
        //
        //        return -1;

        return IntStream.range(0, count)
                        .filter(i -> array[i] == item)
                        .findFirst()
                        .orElse(-1);

    }
}
