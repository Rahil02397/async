package com.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class AsyncApplication {

	public static void main(String[] args) {

		SpringApplication.run(AsyncApplication.class, args);
	}



}
