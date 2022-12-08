import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "a green apple";

        System.out.println(firstNonRepeatedChar(str));
    }

    public static char firstNonRepeatedChar(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char character : chars)
            map.put(character, (map.getOrDefault(character, 0)) + 1);
        //            map.put(character, (str.length() - str.replace(("" +
        //            character), "").length()));


        for (char character : chars)
            if (map.get(character) == 1)
                return character;

        return Character.MIN_VALUE;
    }
}