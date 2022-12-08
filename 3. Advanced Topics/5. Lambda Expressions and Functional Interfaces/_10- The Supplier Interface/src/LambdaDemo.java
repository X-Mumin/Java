import com.sun.deploy.ui.DialogTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void show() {
        Supplier<Double> getRandom = () -> Math.random();
        System.out.println(getRandom.get());
    }
}
