package com.training.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.dao.HelloWorldDAO;
import com.training.demo.model.Message;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
	
	@Autowired
	private HelloWorldDAO dao;

	@Override
	public String getHelloMessage() {
		
		//return "Hello World !! Why the hell we are in this IT Corporate World";
		return dao.getHelloMessage();
	}

	@Override
	public String addMessage(Message message) {
		return dao.addMessage(message);
	}

}
