package com.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {
    @Async
    public void executeTask() throws InterruptedException {
        int i;
        Thread.sleep(10000);
        for (i = 0; i < 10000; i++) {
            System.out.println(i + ",");
        }
        System.out.println("done");
        Thread.sleep(11111);
        int j;
        for (j = 0; j < 10000; j++) {
            System.out.println("rahil");
        }
    }
}
