package com.journaldev.spring.model;

import java.util.Set;

import javax.persistence.*;  

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author pankaj
 *
 */
@Entity
@Table(name="BOOK")
public class Book{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="book_name")
	private String name;
	
	@ManyToOne  
    @JoinColumn(name = "author_id")  
	private Author author;

	@OneToMany(mappedBy="book", cascade=CascadeType.ALL)
	private Set<Person> persons;
	
	@Column(name="book_edition")
	private String edition;



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Author getAuthor() {
		return author;
	}



	public void setAuthor(Author author) {
		this.author = author;
	}



	public Set<Person> getPersons() {
		return persons;
	}



	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}



	public String getEdition() {
		return edition;
	}



	public void setEdition(String edition) {
		this.edition = edition;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author
				+ ", edition=" + edition + "]";
	}


}
