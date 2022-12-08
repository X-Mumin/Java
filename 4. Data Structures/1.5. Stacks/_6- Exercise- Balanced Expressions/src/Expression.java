import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private static final List<Character> opening =
            Arrays.asList('{', '<', '(', '[');
    private static final List<Character> closing =
            Arrays.asList('}', '>', ')', ']');
    private String expression;

    public Expression(String str) {
        expression = str;
    }

    public boolean isBalanced() {
        Stack<Character> stack = new Stack<>();
        expression = expression.replaceAll("[a-zA-Z\\d]", "");

        for (char c : expression.toCharArray()) {
            int openIndex = opening.indexOf(c);
            int closIndex = closing.indexOf(c);
            if (openIndex > -1)
                stack.push(c);
            else if (closIndex > -1) {
                if (stack.isEmpty() ||
                        (!(closIndex == opening.indexOf(stack.peek()))))
                    return false;

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}