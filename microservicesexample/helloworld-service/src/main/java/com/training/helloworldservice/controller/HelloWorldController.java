package com.training.helloworldservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloAll() {
		return "Hello All please focus !!! ";
	}
}
