package com.training.bookapp.service;

import java.util.List;

import com.training.bookapp.exceptions.BookNotFoundException;
import com.training.bookapp.model.Book;

public interface BookService {
	// Create
	public String createBook(Book book);

	// Retrieve by primary key or by bookId
	public Book retrieveBook(Integer bookId) throws BookNotFoundException;

	// Update
	public String updateBook(Book book);

	// Delete
	public String delete(Integer bookId) throws BookNotFoundException;

	// Retrieve All
	public List<Book> retrieveBooks() throws BookNotFoundException;

	// Retrieve By bookName
	public Book retrieveBookByName(String bookName) throws BookNotFoundException;

	// Retrieve By author
	public List<Book>  retrieveBookByAuthor(String author) throws BookNotFoundException;
}
