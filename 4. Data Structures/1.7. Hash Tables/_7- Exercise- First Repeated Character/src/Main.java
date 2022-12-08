import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String str = "green apple";

        System.out.println(firstRepeatedChar(str));
    }

    private static char firstRepeatedChar(String str) {
        HashSet<Character> set = new HashSet<>();
        char[] chars = str.toCharArray();

        for(char ch : chars) {
            if (set.contains(ch))
                return ch;

            set.add(ch);
        }
        return '\0';
    }
}