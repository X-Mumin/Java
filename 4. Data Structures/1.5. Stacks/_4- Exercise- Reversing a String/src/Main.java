import java.util.Stack;

public class Main {

    public static String reverseString(String str) {
        if (str == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "abcd";

        System.out.println(str);
        str = reverseString(str);
        System.out.println(str);
    }
}