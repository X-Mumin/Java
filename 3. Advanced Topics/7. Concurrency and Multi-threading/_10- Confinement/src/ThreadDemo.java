import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {
        List<Thread> threadList = new ArrayList<>();
        List<DownloadFileTask> downloadFileTaskList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            DownloadFileTask downloadFileTask = new DownloadFileTask();
            downloadFileTaskList.add(downloadFileTask);

            Thread thread = new Thread(downloadFileTask);
            thread.start();
            threadList.add(thread);
        }

        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Integer totalBytes = downloadFileTaskList.stream()
                                                 .map(downloadFileTask -> downloadFileTask.getDownloadStatus()
                                                                                          .getTotalBytes())
                                                 .reduce(Integer::sum)
                                                 .get();

        System.out.println(totalBytes);
    }
}
