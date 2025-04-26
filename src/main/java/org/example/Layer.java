package org.example;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Layer {
    List<Fetcher> currFetcher;

    public boolean execute(Context context){
        ExecutorService executorService = Executors.newCachedThreadPool();
//        Future<Fetcher> future = new CompletableFuture<>();
        for (int i = 0; i < currFetcher.size(); i++) {
            int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    currFetcher.get(finalI).fetch(context);
                }
            });
        }
        return true;
    }
}
