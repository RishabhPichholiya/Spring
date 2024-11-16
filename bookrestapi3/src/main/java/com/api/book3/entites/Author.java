package com.api.book3.entites;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int auth_id;
	private String auth_firstname;
	private String auth_lastname;
	private String auth_language;
	
	@OneToOne(mappedBy ="author")
	@JsonBackReference
	private Book book; //Bidirectional mapping
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int auth_id, String auth_firstname, String auth_lastname, String auth_language, Book book) {
		super();
		this.auth_id = auth_id;
		this.auth_firstname = auth_firstname;
		this.auth_lastname = auth_lastname;
		this.auth_language = auth_language;
		this.book = book;
	}

	public int getAuth_id() {
		return auth_id;
	}
	public void setAuth_id(int auth_id) {
		this.auth_id = auth_id;
	}
	public String getAuth_firstname() {
		return auth_firstname;
	}
	public void setAuth_firstname(String auth_firstname) {
		this.auth_firstname = auth_firstname;
	}
	public String getAuth_lastname() {
		return auth_lastname;
	}
	public void setAuth_lastname(String auth_lastname) {
		this.auth_lastname = auth_lastname;
	}
	public String getAuth_language() {
		return auth_language;
	}
	public void setAuth_language(String auth_language) {
		this.auth_language = auth_language;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Author [auth_id=" + auth_id + ", auth_firstname=" + auth_firstname + ", auth_lastname=" + auth_lastname
				+ ", auth_language=" + auth_language + "]";
	}
	
	
}
