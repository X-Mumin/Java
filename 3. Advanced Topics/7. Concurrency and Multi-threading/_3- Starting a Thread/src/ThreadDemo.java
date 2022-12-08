import java.util.stream.IntStream;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread()
                                 .getName());

        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }

        IntStream.range(0, 2)
                 .mapToObj(i -> new Thread(new DownloadFileTask()))
                 .forEach(Thread::start);
    }
}
