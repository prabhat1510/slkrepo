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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> retrieveBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book retrieveBookByName(String bookName) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book retrieveBookByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
