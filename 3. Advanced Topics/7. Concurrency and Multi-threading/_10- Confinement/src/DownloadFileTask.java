public class DownloadFileTask implements Runnable {
    private DownloadStatus downloadStatus;

    public DownloadFileTask() {
        this.downloadStatus = new DownloadStatus();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread()
                                 .getName() + " -> " + "Downloading a file!");

        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread()
                      .isInterrupted())
                return;

            downloadStatus.incrementTotalBytes();
        }

        System.out.println(Thread.currentThread()
                                 .getName() + " -> Downloading Completed!");
    }

    public DownloadStatus getDownloadStatus() {
        return downloadStatus;
    }
}
