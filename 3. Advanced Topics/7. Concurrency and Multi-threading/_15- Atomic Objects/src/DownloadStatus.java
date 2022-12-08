import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private final AtomicInteger totalBytes = new AtomicInteger();

    public AtomicInteger getTotalBytes() {
        return totalBytes;
    }
    public void incrementTotalBytes() {
        totalBytes.incrementAndGet();
    }
}
