import java.util.concurrent.*;

public class CompletableFuturesDemo {

    public static CompletableFuture<Integer> first() {
        return CompletableFuture.supplyAsync(() -> 1);
    }

    public static CompletableFuture<Integer> second() {
        return CompletableFuture.supplyAsync(() -> 2);
    }

    public static CompletableFuture<Integer> third() {
        return CompletableFuture.supplyAsync(() -> 3);
    }

    public static void show() {
        CompletableFuture<Void> all = //  void as return is not
                // guaranteed for a certain type.
                CompletableFuture.allOf(first(), second(), third());

        all.thenRun(() -> {
            try {
                System.out.println(first().get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }

            System.out.println("All tasks completed successfully");
        });
    }
}