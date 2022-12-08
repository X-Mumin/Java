import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightService {

    private final Stream<CompletableFuture<Quote>> quotes;

    public FlightService(List<String> sites) {
        this.quotes = sites.stream()
                           .map(this::getQuote);
    }

    public CompletableFuture<Quote> getQuote(String site) {

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from " + site);

            Random random = new Random();
            LongTask.simulate(1_000 + random.nextInt(2_000));

            int price = 100 + random.nextInt(20 + 10) - 10;
            return new Quote(site,
                             price);
        });
    }

    public List<CompletableFuture<Void>> getQuotes(List<String> sites) {
        return quotes.map(future -> future.thenAccept(System.out::println))
                     .collect(Collectors.toList());
    }
}
