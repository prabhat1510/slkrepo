package com.training.basicspringsecuritydemousingdb.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
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
