import com.sun.deploy.ui.DialogTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class LambdaDemo {
    public static void show() {
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        System.out.println(increment.andThen(square).apply(1));
        System.out.println(square.andThen(increment).apply(1));
    }
}
