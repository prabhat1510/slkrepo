package com.training.basicspringsecuritydemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicDemoController {
	
	@GetMapping("/greet")
	@PreAuthorize("hasRole('USER')")
	public String greetings() {
		return "Good Afternoon All !!!";
	}
	
	
	@GetMapping("/admingreet")
	@PreAuthorize("hasRole('ADMIN')")
	public String greetingsForAdmin() {
		return "Good Afternoon Admin !!!";
	}

}
