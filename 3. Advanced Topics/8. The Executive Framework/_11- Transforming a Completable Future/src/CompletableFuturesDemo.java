import java.util.concurrent.*;

public class CompletableFuturesDemo {
    public static int toFahrenheit(int celsius) {
        return (int) ((celsius * 1.8) + 32);
    }

    public static void show() {
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> 40);

        future.thenApplyAsync(CompletableFuturesDemo::toFahrenheit)
              .thenAccept(System.out::println);
    }
}