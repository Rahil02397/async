package com.async.controller;

import com.async.service.AsyncService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.CompletableFuture;


@RestController
@RequestMapping("/api/async-task")
public class AsyncController {

    private AsyncService asyncService;

    public AsyncController(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    // this methods return the string and runs in background. That is called asynchronous.
    @PostMapping("/add")
    public CompletableFuture<String> executeTask() throws InterruptedException {
        asyncService.executeTask();
        return  CompletableFuture.completedFuture("Successfully uploaded data");
    }

    @GetMapping("/date")
    public String getDate(){
       return new Date().toString();
    }
}
