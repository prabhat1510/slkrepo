package com.training.demo.dao;

import com.training.demo.model.Message;

public interface HelloWorldDAO {

	public String getHelloMessage();
	public String addMessage(Message message);

}
