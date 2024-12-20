package com.training.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String getHelloMessage() {
		
		return "Hello World !! Why the hell we are in this IT Corporate World";
	}

}
