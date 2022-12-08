import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;
    private final Object totalBytesLock = new Object();
    private final Object totalFilesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }
    public void incrementTotalBytes() {
        synchronized (totalBytesLock){
            totalBytes++;
        }
    }
    public void incrementTotalFiles() {
        synchronized (totalFilesLock){
            totalFiles++;
        }
    }
}
