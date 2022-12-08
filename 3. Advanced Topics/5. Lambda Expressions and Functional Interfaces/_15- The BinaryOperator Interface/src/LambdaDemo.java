import com.sun.deploy.ui.DialogTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class LambdaDemo {
    public static void show() {
//        BinaryOperator<Integer> add = Integer::sum;
        BinaryOperator<Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> square = a -> a * a;

        System.out.println(add.andThen(square).apply(1, 2));
    }
}
