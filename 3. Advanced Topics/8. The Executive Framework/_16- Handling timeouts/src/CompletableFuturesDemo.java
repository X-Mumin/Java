import java.util.concurrent.*;

public class CompletableFuturesDemo {

    public static void show() {
        try {
            System.out.println(Helper.supplyAsync(() -> {
                                                      LongTask.simulate();
                                                      return 20;
                                                  },
                                                  1,
                                                  TimeUnit.SECONDS,
                                                  "Timeout!")
                                     .get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}