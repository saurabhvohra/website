package com.journaldev.spring.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dao.AuthorDAO;
import com.journaldev.spring.dao.BookDAO;
import com.journaldev.spring.dao.PersonDAO;
import com.journaldev.spring.dao.imp.AuthorDAOImpl;
import com.journaldev.spring.dao.imp.BookDAOImpl;
import com.journaldev.spring.model.Author;
import com.journaldev.spring.model.Book;
import com.journaldev.spring.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	private PersonDAO personDAO;

	private AuthorDAO authorDAO; 
	
	private BookDAO bookDAO;
	
	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	public void setAuthorDAO(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@Override
	@Transactional
	public void addPerson(Person p) { 

	Author author = new Author();
	author.setFirstName("Cahrlie");
	author.setLastName("Thomas");
	
	
	Set<Book> books = new HashSet<Book>(); 
	Book bookOne = new Book();
	Book bookTwo = new Book();
	
	bookOne.setAuthor(author);
	bookOne.setName("On the way to destination");
	bookOne.setEdition("1st Edition");
	
	bookTwo.setAuthor(author);
	bookTwo.setName("On the way to destinationTwo");
	bookTwo.setEdition("2nd Edition");
	author.setBooks(books);
	
	Set<Person> persons = new HashSet<Person>(); 
	Person personOne = new Person();
	Person personTwo = new Person();
	
	personOne.setFirstName("Saurabh");
	personOne.setLastName("Vohra");
	personOne.setCountry("CANADA");
	personOne.setBook(bookOne);
	
	personTwo.setFirstName("Gaurav");
	personTwo.setLastName("Vohra");
	personTwo.setCountry("INDIA");
	personTwo.setBook(bookOne);
	
	bookOne.setPersons(persons);
	authorDAO.addAuthor(author);
	bookDAO.addBook(bookOne);
	this.personDAO.addPerson(personOne);
	}

	@Override
	@Transactional
	public void updatePerson(Person p) {
		this.personDAO.updatePerson(p);
	}

	@Override
	@Transactional
	public List<Person> listPersons() {
		return this.personDAO.listPersons();
	}

	@Override
	@Transactional
	public Person getPersonById(int id) {
		return this.personDAO.getPersonById(id);
	}

	@Override
	@Transactional
	public void removePerson(int id) {
		this.personDAO.removePerson(id);
	}

}
