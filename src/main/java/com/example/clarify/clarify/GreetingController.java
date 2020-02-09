package com.example.clarify.clarify;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/login")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("receive request for : "+name);
		return (counter.incrementAndGet()+"..."+String.format(template, name));
	}
}