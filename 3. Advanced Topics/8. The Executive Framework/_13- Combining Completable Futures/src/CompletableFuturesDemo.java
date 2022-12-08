import java.util.concurrent.*;

public class CompletableFuturesDemo {

    public static CompletableFuture<Integer> getProductPriceAsync() {
        return CompletableFuture
                .supplyAsync(() -> "20 USD $")
                .thenApply(
                        str -> Integer.parseInt(str.replaceAll("[^\\d.]", "")));
    }

    public static CompletableFuture<Double> getExchangeRateAsync() {
        return CompletableFuture.supplyAsync(() -> 0.9);
    }

    public static void show() {
        getProductPriceAsync()
                .thenCombine(getExchangeRateAsync(),
                        (price, exchangeRate) -> price * exchangeRate)
                .thenAccept(System.out::println);
    }
}