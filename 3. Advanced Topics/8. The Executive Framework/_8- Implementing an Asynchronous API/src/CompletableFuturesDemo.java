import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class CompletableFuturesDemo {
    public static void show() {
        //        ForkJoinPool.commonPool();
        Runnable task = () -> System.out.println("a");
        CompletableFuture<Void> completableFuture =
                CompletableFuture.runAsync(task);

        Supplier<Integer>integerSupplier = () -> 1;
        CompletableFuture<Integer> completableFuture1 =
                CompletableFuture.supplyAsync(integerSupplier);

        try {
            System.out.println(completableFuture1.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
