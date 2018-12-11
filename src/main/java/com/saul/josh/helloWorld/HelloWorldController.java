package com.saul.josh.helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String index() {
		return "Hello World, it's Josh and this is my first go at Spring Boot";
	}
	
}
