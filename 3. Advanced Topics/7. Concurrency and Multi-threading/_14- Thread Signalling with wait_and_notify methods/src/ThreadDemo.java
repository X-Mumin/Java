import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {
        DownloadStatus downloadStatus = new DownloadStatus();

        Thread thread1 = new Thread(new DownloadFileTask(downloadStatus));
        Thread thread2 = new Thread(() -> {
            while (!downloadStatus.isDone()) {
                synchronized (downloadStatus) {
                    try {
                        downloadStatus.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println(downloadStatus.getTotalBytes());
        });

        thread1.start();
        thread2.start();
    }
}
