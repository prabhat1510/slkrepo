package com.training.bookapp.controller;

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
	//Get book form
	@GetMapping("/bookform")
	public ModelAndView getBookForm(@ModelAttribute Book book){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("bookform");
		return mv;
	}
	
	//Create
	@PostMapping("/addbook")
	public ModelAndView createBook(@ModelAttribute Book book){
		String message = service.createBook(book);
		ModelAndView mv = new ModelAndView();
		mv.addObject("successmsg","Book added successfully");
		mv.setViewName("success");
		return mv;
	}
	
	// Retrieve by primary key or by bookId 
	//URL -- http://localhost:8080/getbookbyid/1
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
}
