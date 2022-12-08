import java.util.concurrent.*;

public class CompletableFuturesDemo {

    public static CompletableFuture<Integer> slowAsync() {
        return CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });
    }

    public static CompletableFuture<Integer> fastAsync() {
        return CompletableFuture.supplyAsync(() -> 20);
    }

    public static void show() {
        CompletableFuture<Object> any = //  void as return is not
                // guaranteed for a certain type.
                CompletableFuture.anyOf(slowAsync(), fastAsync());

        any.thenAccept(System.out::println);
    }
}