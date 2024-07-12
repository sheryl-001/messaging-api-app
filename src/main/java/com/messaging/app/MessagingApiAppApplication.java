package com.messaging.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagingApiAppApplication {
	
	@GetMapping("message")
	public String printGreetings() {
		return "Hi Oracle";
	}
	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
	}

}
