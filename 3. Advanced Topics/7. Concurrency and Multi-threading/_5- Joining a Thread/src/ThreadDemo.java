public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread()
                                 .getName());


        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();

            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("File is ready to be scanned.");
        }
    }
}
