public class DownloadStatus {
    private volatile boolean isDone;
    private int totalBytes;
    private final Object totalBytesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }
    public void incrementTotalBytes() {
        synchronized (totalBytesLock){
            totalBytes++;
        }
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
