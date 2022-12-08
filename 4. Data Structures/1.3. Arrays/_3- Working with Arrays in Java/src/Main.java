import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = new int[3];
        int[] numbers2 = {10, 20, 30};

        numbers2[0] = 30;

        System.out.println(numbers1.length);
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

    }
}