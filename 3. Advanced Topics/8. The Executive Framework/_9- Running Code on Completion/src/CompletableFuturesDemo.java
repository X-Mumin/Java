import java.util.concurrent.*;
import java.util.function.Supplier;

public class CompletableFuturesDemo {
    public static void show() {
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> 1);

        future.thenRun(() -> {
            System.out.println(Thread.currentThread()
                                     .getName());
            System.out.println("Done");
            System.out.println();
        });

        future.thenRunAsync(() -> {
            System.out.println(Thread.currentThread()
                                     .getName());
            System.out.println("Done");
            System.out.println();
        });

        future.thenAccept(result -> {
            System.out.println(Thread.currentThread()
                                     .getName());
            System.out.println(result);
            System.out.println();
        });

        future.thenAcceptAsync(result -> {
            System.out.println(Thread.currentThread()
                                     .getName());
            System.out.println(result);
            System.out.println();
        });
    }
}