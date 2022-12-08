public class DownloadFileTask implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " -> " +
                "Downloading a file!");
    }
}
