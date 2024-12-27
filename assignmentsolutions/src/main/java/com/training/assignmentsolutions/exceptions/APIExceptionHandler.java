package com.training.assignmentsolutions.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class APIExceptionHandler {

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handleCustomerNotFoundException(CustomerNotFoundException c){
		return new ResponseEntity<String> (c.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<String> handleOrderNotFoundException(OrderNotFoundException o){
		return new ResponseEntity<String> (o.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException p){
		return new ResponseEntity<String> (p.getMessage(),HttpStatus.NOT_FOUND);
	}

}
