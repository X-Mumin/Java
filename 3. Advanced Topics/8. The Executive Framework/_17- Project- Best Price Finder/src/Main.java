import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        LocalTime start = LocalTime.now();

        List<String> sites = new ArrayList<>();
        Collections.addAll(sites,
                           "SiteX",
                           "SiteY",
                           "SiteZ");

        FlightService flightService = new FlightService(sites);

        List<CompletableFuture<Void>> quotes = flightService.getQuotes(sites);

        CompletableFuture.allOf(quotes.toArray(new CompletableFuture[0]))
                         .thenRun(() -> {
                             System.out.println("All quotes retrieved in " +
                                                        Duration.between(start,
                                                                         LocalTime.now())
                                                                .toMillis() +
                                                        " msec.");
                         });

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
