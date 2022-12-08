import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {
        DownloadStatus downloadStatus = new DownloadStatus();

        List<Thread> threadList = new ArrayList<>();
        for(int i=0; i< 10; i++) {
            Thread thread = new Thread(new DownloadFileTask(downloadStatus));
            thread.start();
            threadList.add(thread);
        }

        for(Thread thread: threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(downloadStatus.getTotalBytes());
    }
}
