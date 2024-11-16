package com.api.boot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.boot.entities.Book;
@Component
public class BookService {

	private static List <Book> list= new ArrayList<>();
	
	static {
		list.add(new Book(001,"Sherlock Holmes","Arthur Conan Doyle"));
		list.add(new Book(002,"Harry Porter","J.K. Rowling"));
		list.add(new Book(003,"Alice in the Wonderland","Lewis Carrol"));
	}
	
	//get all books
	public List<Book> getAllBooks() {
		return list;
	}
	
	//get single book by ID 
	public Book getBookById(int id) {
		Book book =null;
		try {
		book =list.stream().filter(e->e.getId()==id).findFirst().get();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return book;
	}
	
	//adding the book
	public Book addBook(Book book) {
		list.add(book);
		return book;
	}
	
	//deleting the book
	public Book deleteBook(int bid) {
		Book book = null;
		book =list.stream().filter(e->e.getId()==bid).findFirst().get();
		list=list.stream().filter(e->e.getId()!=bid).collect(Collectors.toList());
		return book;
	}
	
	//updating the book 
	public Book updateBook(Book book,int bid) {
		list =list.stream().map(b->{
			if(b.getId()==bid) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());	
		System.out.println(list);
		return book;
	}
}
