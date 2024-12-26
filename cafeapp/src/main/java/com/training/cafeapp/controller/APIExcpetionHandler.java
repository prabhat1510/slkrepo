package com.training.cafeapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.training.cafeapp.exceptions.CafeNotFoundException;

@RestControllerAdvice
public class APIExcpetionHandler {
	
	@ExceptionHandler(CafeNotFoundException.class)
	public ResponseEntity<String> handleCafeNotFoundException(CafeNotFoundException c){
		return new ResponseEntity<String>(c.getMessage(),HttpStatus.NOT_FOUND);
	}

}
