package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.GreetingService;

@RestController
@RequestMapping("/api")
public class HelloController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping("/hello")
	public String sayHello(@RequestParam(defaultValue = "World") String name) {
		return greetingService.greet(name);
	}
}