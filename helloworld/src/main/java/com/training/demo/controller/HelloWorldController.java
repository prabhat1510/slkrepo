package com.training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.demo.service.HelloWorldService;

@Controller
public class HelloWorldController {

	@Autowired
	private HelloWorldService service;//Ddependency of service class is injected

	//Below is handler method to handle HTTP GET method with uri /hello
	//http://localhost:8080/hello
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView getHelloMessage() {
		String msg = service.getHelloMessage();// Making a call to the service layer to retrieve the data or model
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", msg);//msg is the model which we want to send as part of the response
		mv.setViewName("hello");// This view name hello is the name of the hello.html
		return mv;
	}
}
