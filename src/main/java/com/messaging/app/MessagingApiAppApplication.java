package com.messaging.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagingApiAppApplication {
	
	@GetMapping("enjoyWeekend")
	public String printGreetings() {
		return "Saturday and Sunday";
	}
	
	@GetMapping("dontEnjoyWeekday")
	public String printGreetings2() {
		return "MTWTF";
	}
	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		System.out.println("Hello Folks!\nThis is my first messaging API app ;)");
	}

}
