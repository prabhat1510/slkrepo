package com.training.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.bookapp.exceptions.BookNotFoundException;
import com.training.bookapp.model.Book;
import com.training.bookapp.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService service;

	// Get book form
	@GetMapping("/bookform")
	public ModelAndView getBookForm(@ModelAttribute Book book) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("bookform");
		return mv;
	}

	// Create
	@PostMapping("/addbook")
	public ModelAndView createBook(@ModelAttribute Book book) {
		String message = service.createBook(book);
		ModelAndView mv = new ModelAndView();
		mv.addObject("successmsg", "Book added successfully");
		mv.setViewName("success");
		return mv;
	}

	// Retrieve by primary key or by bookId
	// URL -- http://localhost:8080/getbookbyid/1
	@GetMapping("/getbookbyid/{bookId}")
	public ModelAndView retrieveBook(@PathVariable("bookId") Integer bookId) {
		ModelAndView mv = null;
		Book book;
		try {
			book = service.retrieveBook(bookId);
			mv = new ModelAndView();
			mv.addObject("book", book);
			mv.setViewName("booksuccess");
		} catch (BookNotFoundException e) {
			mv.addObject("errormsg", e.getMessage());
			mv.setViewName("error");
		}

		return mv;
	}

	// Retrieve by author
	// URL -- http://localhost:8080/bookbyauthor/Prabhat
	@GetMapping("/bookbyauthor/{author}")
	public ModelAndView retrieveBookByAuthor(@PathVariable("author") String author) {
		ModelAndView mv = null;
		List<Book> listOfBook;
		try {
			listOfBook = service.retrieveBookByAuthor(author);
			mv = new ModelAndView();
			mv.addObject("listOfBook", listOfBook);
			mv.setViewName("booksuccesslist");
		} catch (BookNotFoundException e) {
			mv.addObject("errormsg", e.getMessage());
			mv.setViewName("error");
		}

		return mv;
	}

	// Retrieve by bookName
	// URL -- http://localhost:8080/bookbyname/Prabhat
	@GetMapping("/bookbyname/{bookName}")
	public ModelAndView retrieveBookByName(@PathVariable("bookName") String bookName) {
		ModelAndView mv = null;
		Book book;
		try {
			book = service.retrieveBookByName(bookName);
			mv = new ModelAndView();
			mv.addObject("book", book);
			mv.setViewName("booksuccess");
		} catch (BookNotFoundException e) {
			mv.addObject("errormsg", e.getMessage());
			mv.setViewName("error");
		}

		return mv;
	}

	// Retrieve all books
	// URL -- http://localhost:8080/books
	@GetMapping("/books")
	public ModelAndView retrieveBooks() {
		ModelAndView mv = null;
		List<Book> listOfBooks;
		try {
			listOfBooks = service.retrieveBooks();
			mv = new ModelAndView();
			mv.addObject("listOfBook", listOfBooks);
			mv.setViewName("booksuccesslist");
		} catch (BookNotFoundException e) {
			mv.addObject("errormsg", e.getMessage());
			mv.setViewName("error");
		}

		return mv;
	}

	// Delete by primary key or by bookId
	// URL -- http://localhost:8080/deletebookbyid/1
	@GetMapping("/deletebookbyid/{bookId}")
	public ModelAndView deleteBookById(@PathVariable("bookId") Integer bookId) {
		ModelAndView mv = null;
		String message;
		try {
			message = service.delete(bookId);
			mv = new ModelAndView();
			mv.addObject("successmsg", message);
			mv.setViewName("success");
		} catch (BookNotFoundException e) {
			mv.addObject("errormsg", e.getMessage());
			mv.setViewName("error");
		}

		return mv;
	}
}
