package com.journaldev.spring.dao;

import java.util.List;


import com.journaldev.spring.model.Book;
import com.journaldev.spring.model.Person;
import com.journaldev.spring.model.Author;


public interface AuthorDAO {

	public void addAuthor(Author author);
	public void updateAuthor(Author author);
	public List<Author> listAuthors();
	public Book getAuthorById(int authorId);
	public void removeAuthor(int authorId);
}
