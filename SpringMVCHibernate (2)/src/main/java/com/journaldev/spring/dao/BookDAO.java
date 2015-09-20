package com.journaldev.spring.dao;

import java.util.List;

import com.journaldev.spring.model.Book;
import com.journaldev.spring.model.Person;

public interface BookDAO {

	public void addBook(Book book);
	public void updateBook(Book book);
	public List<Book> listBooks();
	public Book getBookById(int bookId);
	public void removeBook(int bookId);
}
