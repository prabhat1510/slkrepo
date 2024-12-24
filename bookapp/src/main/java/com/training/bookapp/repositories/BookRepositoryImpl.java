package com.training.bookapp.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.bookapp.exceptions.BookNotFoundException;
import com.training.bookapp.model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public String createBook(Book book) {
		String sqlQuery = "insert into book values(?,?,?,?)";
		jdbcTemplate.update(sqlQuery, book.getBookId(),book.getBookName(),book.getAuthor(),book.getPrice());
		return "Book added successfully";
	}

	@Override
	public Book retrieveBook(Integer bookId) throws BookNotFoundException {
		String sqlQuery="select * from book where bookId=?";
		Book book = jdbcTemplate.queryForObject(sqlQuery, BeanPropertyRowMapper.newInstance(Book.class),bookId);
		if(book != null) {
			return book;
		}else {
			throw new BookNotFoundException("Book with bookId "+bookId+" not found ");
		}
	}

	@Override
	public String updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer bookId) throws BookNotFoundException {
		String sqlQuery="delete from book where bookId=?";
		int row = jdbcTemplate.update(sqlQuery,bookId);
		if(row > 0 ) {
			return "Book with bookId "+bookId+" deleted successfully";
		}else {
			throw new BookNotFoundException("Book with bookId "+bookId+" not found ");
		}
	}

	@Override
	public List<Book> retrieveBooks() throws BookNotFoundException {
		String sqlQuery="select * from book";
		List<Book> listOfBook = jdbcTemplate.query(sqlQuery, BeanPropertyRowMapper.newInstance(Book.class));
		if(listOfBook != null) {
			return listOfBook;
		}else {
			throw new BookNotFoundException("Books not found ");
		}
	}

	@Override
	public Book retrieveBookByName(String bookName) throws BookNotFoundException {
		String sqlQuery="select * from book where bookName=?";
		Book book = jdbcTemplate.queryForObject(sqlQuery, BeanPropertyRowMapper.newInstance(Book.class),bookName);
		if(book != null) {
			return book;
		}else {
			throw new BookNotFoundException("Book with bookName "+bookName+" not found ");
		}
	}

	@Override
	public List<Book> retrieveBookByAuthor(String author) throws BookNotFoundException {
		String sqlQuery="select * from book where author=?";
		List<Book> listOfBook = jdbcTemplate.query(sqlQuery, BeanPropertyRowMapper.newInstance(Book.class),author);
		if(listOfBook != null) {
			return listOfBook;
		}else {
			throw new BookNotFoundException("Books with author "+author+" not found ");
		}
	}

}
