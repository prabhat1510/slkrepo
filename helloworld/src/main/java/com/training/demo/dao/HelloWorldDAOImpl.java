package com.training.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.demo.model.Message;

@Component
public class HelloWorldDAOImpl implements HelloWorldDAO {
	 
	//Collection to store data 
	private static List<Message> listOfMessages = new ArrayList<Message>();
	
	@Override
	public String getHelloMessage() {
		
		//return listOfMessages.get(0).getMessage();
		return "Message from Hello World DAO Impl";
	}

	@Override
	public String addMessage(Message message) {
		listOfMessages.add (message);
		return "Add operation successful";
	}

}
