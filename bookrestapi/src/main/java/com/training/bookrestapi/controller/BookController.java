package com.training.bookrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.bookrestapi.exceptions.BookNotFoundException;
import com.training.bookrestapi.model.Book;
import com.training.bookrestapi.service.BookService;

@RestController
@RequestMapping("/bookapi")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/test")
	public String hello() {
		return "Test for book rest api  is successful";
	}

	// Create a new book
	// http://localhost:8080/bookapi/book/new
	@PostMapping("/book/new")
	public ResponseEntity<String> createBook(@RequestBody Book book) {
		String msg = bookService.createBook(book);
		if (msg != null) {
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Unable to create book", HttpStatus.BAD_REQUEST);
		}
	}

	// Retrieve by primary key or by bookId
	@GetMapping("/book/{bookId}")
	public ResponseEntity retrieveBook(@PathVariable("bookId") Integer bookId) {
		Book book;
		try {
			book = bookService.retrieveBook(bookId);
			return new ResponseEntity(book,HttpStatus.FOUND);
		} catch (BookNotFoundException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
		
	}

}
