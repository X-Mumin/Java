public class DownloadFileTask implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread()
                                 .getName() + " -> " + "Downloading a file!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread()
                                 .getName() + " -> Downloading Completed!");
    }
}
