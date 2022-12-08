import com.sun.deploy.ui.DialogTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void show() {
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        System.out.println(replaceColon.andThen(addBraces).apply("key:value"));
        System.out.println(addBraces.compose(replaceColon).apply("key:value"));
    }
}
