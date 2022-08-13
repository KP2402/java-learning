package prashant.learning.future;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.*;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<String> completableFuture = calculateAsync();

        Deque<Integer> deque = new LinkedList<>();
        deque.push(1);

        String result = completableFuture.get();
    }

    public static Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        ExecutorService service = Executors.newCachedThreadPool();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello");
            return null;
        });

        return completableFuture;
    }
}
