package com.sgsistemas.capacitacion.testserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/say-hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Hi " + name + "!!!";
	}
	
	@GetMapping("/say-hello2")
	public String sayHello2(@RequestParam(name="name", required = true) String name) {
		return "Hi " + name + "!!!";
	}
}
