import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorsDemo {
    public static void show() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        try {
            for (int i = 0; i < 10; ++i) {
                executorService.submit(() -> {
                    System.out.println(Thread.currentThread()
                                             .getName());
                });
            }
        }
        finally {
            executorService.shutdown();
        }

//        executorService.shutdownNow();
    }
}
