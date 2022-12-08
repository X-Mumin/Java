import java.time.Duration;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        String str1 = "(((<[1]> + <<2>{a}>)";
        String str2 = ")";
        String str3 = "(((<[1]>) + <<2>{a}>))";

        Expression expression = new Expression(str3);
        System.out.println(expression.isBalanced());
    }
}