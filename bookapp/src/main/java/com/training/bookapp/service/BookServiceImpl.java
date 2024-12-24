package com.training.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bookapp.exceptions.BookNotFoundException;
import com.training.bookapp.model.Book;
import com.training.bookapp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public String createBook(Book book) {
		return bookRepo.createBook(book);
	}

	@Override
	public Book retrieveBook(Integer bookId) throws BookNotFoundException {
		return bookRepo.retrieveBook(bookId);
	}

	@Override
	public String updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer bookId) throws BookNotFoundException {
		return bookRepo.delete(bookId);
	}

	@Override
	public List<Book> retrieveBooks() throws BookNotFoundException {
		return bookRepo.retrieveBooks();
	}

	@Override
	public Book retrieveBookByName(String bookName) throws BookNotFoundException {
		
		return bookRepo.retrieveBookByName(bookName);
	}

	@Override
	public List<Book>  retrieveBookByAuthor(String author) throws BookNotFoundException {
		return bookRepo.retrieveBookByAuthor(author);
	}

}
