import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private final LongAdder totalBytes = new LongAdder();

    public LongAdder getTotalBytes() {
        return totalBytes;
    }
    public void incrementTotalBytes() {
        totalBytes.increment();
    }
}
