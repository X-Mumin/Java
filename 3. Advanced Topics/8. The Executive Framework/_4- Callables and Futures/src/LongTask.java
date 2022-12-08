public class LongTask {
    public static void simulate(int current) {
        System.out.println("Task [" + current + "] is starting.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
