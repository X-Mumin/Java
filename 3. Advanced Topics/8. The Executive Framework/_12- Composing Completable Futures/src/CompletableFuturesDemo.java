import java.util.concurrent.*;

public class CompletableFuturesDemo {
    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getUserPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist");
    }

    public static void show() {
        //  id -> email
        //        CompletableFuture.supplyAsync(() -> "email")
        //                         .thenComposeAsync(
        //                                 email -> CompletableFuture
        //                                 .supplyAsync(
        //                                         () -> "playlist"))
        //                         .thenAccept(System.out::println);
        // email -> playlist

        getUserEmailAsync().thenComposeAsync(
                                   CompletableFuturesDemo::getUserPlaylistAsync)
                           .thenAccept(System.out::println);
    }
}