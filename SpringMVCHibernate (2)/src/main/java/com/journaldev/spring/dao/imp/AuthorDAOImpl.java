package com.journaldev.spring.dao.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.dao.AuthorDAO;
import com.journaldev.spring.dao.BookDAO;
import com.journaldev.spring.model.Author;
import com.journaldev.spring.model.Book;
import com.journaldev.spring.model.Person;

@Repository
public class AuthorDAOImpl implements AuthorDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addAuthor(Author author) {
		Session session = sessionFactory.getCurrentSession();
	    session.persist(author);
		logger.info("Author saved successfully, Author Details="+author);
	}

	@Override
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Author> listAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getAuthorById(int authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAuthor(int authorId) {
		// TODO Auto-generated method stub
		
	}

	
}
