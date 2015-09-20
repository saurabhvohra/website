package com.journaldev.spring.dao.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.dao.BookDAO;
import com.journaldev.spring.model.Book;
import com.journaldev.spring.model.Person;

@Repository
public class BookDAOImpl implements BookDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addBook(Book book) {
		Session session = sessionFactory.getCurrentSession();
	    session.persist(book);
		logger.info("Book saved successfully, Book Details="+book);
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> listBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

}
