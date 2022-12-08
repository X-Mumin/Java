import java.util.concurrent.*;

public class CompletableFuturesDemo {
    public static void show() {
        CompletableFuture<Object> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather");
            throw new IllegalStateException();
        });

        try {
            int lastTemperature = 40;
            System.out.println(future.exceptionally(ex -> lastTemperature)
                                     .get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}