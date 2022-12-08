public class DownloadFileTask implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread()
                                 .getName() + " -> " + "Downloading a file!");

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread()
                      .isInterrupted())
                return;

            System.out.println("Downloading Byte " + i);
        }

        System.out.println(Thread.currentThread()
                                 .getName() + " -> Downloading Completed!");
    }
}
