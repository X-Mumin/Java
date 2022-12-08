import com.sun.deploy.ui.DialogTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void show() {
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        String test1 = "{key:value}";
        String test2 = "{key:value}{";
        System.out.println(hasLeftBrace.or(hasRightBrace).test(test2));
        System.out.println(hasLeftBrace.and(hasRightBrace).test(test1));
        System.out.println(hasRightBrace.negate().test(test2));
    }
}
