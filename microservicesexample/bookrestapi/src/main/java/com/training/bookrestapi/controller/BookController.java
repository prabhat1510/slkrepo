package com.training.bookrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
//@Tag(name="Book API")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/test")
	public String hello() {
		return "Test for book rest api  is successful";
	}

	// Create a new book
	// http://localhost:8080/bookapi/book/new
	//@Operation(summary="Creating a new book")
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
	//@Tag(name="Get Book using book id ")
	//@Operation(summary = "Retrieve book by id - id is passed as parameter")
	@GetMapping("/book/{bookId}")
	public ResponseEntity retrieveBook(@PathVariable("bookId") Integer bookId) {
		Book book;
		try {
			book = bookService.retrieveBook(bookId);
			return new ResponseEntity(book, HttpStatus.FOUND);
		} catch (BookNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

	/**
	 * // Retrieve by bookName @GetMapping("/book/name/{bookName}") public
	 * ResponseEntity retrieveBookByName(@PathVariable("bookName") String bookName)
	 * { Book book; try { book = bookService.retrieveBookByName(bookName); return
	 * new ResponseEntity(book, HttpStatus.FOUND); } catch (BookNotFoundException e)
	 * { return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); }
	 * 
	 * }
	 **/

	// Retrieve by bookName
	@GetMapping("/book/name/{bookName}")
	public ResponseEntity retrieveBookByName(@PathVariable("bookName") String bookName) {
		Book book;
		try {
			book = bookService.retrieveBookByName(bookName);
			return new ResponseEntity(book, HttpStatus.FOUND);
		} catch (BookNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

	// Retrieve by author
	@GetMapping("/book/author/{author}")
	public ResponseEntity retrieveBookByAuthor(@PathVariable("author") String author) throws BookNotFoundException {
		List<Book> listOfBook;
		listOfBook = bookService.retrieveBookByAuthor(author);
		return new ResponseEntity(listOfBook, HttpStatus.FOUND);

	}

	// Retrieve All Books
	@GetMapping("/book/books")
	public ResponseEntity retrieveBooks() {
		List<Book> books;
		try {
			books = bookService.retrieveBooks();
			return new ResponseEntity(books, HttpStatus.OK);
		} catch (BookNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

	// Delete book by id
	@DeleteMapping("/book/delete/{id}")
	public ResponseEntity<String> deleteBookById(@PathVariable("id") Integer bookId) {
		String msg;
		try {
			msg = bookService.delete(bookId);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (BookNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
	}

}
