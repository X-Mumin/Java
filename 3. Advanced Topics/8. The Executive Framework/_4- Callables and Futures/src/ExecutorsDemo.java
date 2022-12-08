import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorsDemo {
    public static void show() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<Integer>> futures = new ArrayList<>();
        try {
            for (int i = 0; i < 8; ++i) {
                int current = i+1;
                int finalI = (i + 1) * 20;
                Collections.addAll(futures, executorService.submit(() -> {
                    LongTask.simulate(current);
                    return finalI;
                }));
            }
            for (int i = 0; i < 8; i++) {
                try {
                    System.out.println(
                            "*** waiting future result[" + (i + 1) + "] ***");
                    System.out.println("Result [" + (i + 1) + "]: " +
                            futures.get(i)
                                   .get());
                    System.out.println("Task [" + (i + 1) + "]'s thread is " +
                            "continued.");
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        } finally {
            executorService.shutdown();
        }

        //        executorService.shutdownNow();
    }
}
