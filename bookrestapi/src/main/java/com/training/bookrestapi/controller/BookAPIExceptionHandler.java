package com.training.bookrestapi.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.training.bookrestapi.exceptions.BookNotFoundException;

@RestControllerAdvice
public class BookAPIExceptionHandler {

	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity handleBookNotFoundException(BookNotFoundException e) {
		return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(DataAccessException.class)
	public ResponseEntity handleDataAccessException(DataAccessException e) {
		return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
