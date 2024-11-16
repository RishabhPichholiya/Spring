package com.api.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.dao.BookRepository;
import com.api.book.entites.Book;

@Component
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	//get All Books 
	public List<Book> getAllBooks(){
		List <Book> list = (List<Book>)this.bookRepository.findAll();
		System.out.println(list);
		return list;
	}
	
	//get a single Book by Id
		public Book getBook(int id){
			Book book = null;
			try {
				book = this.bookRepository.findById(id);
				}
			catch(Exception e) {
				e.printStackTrace();
			}
			return book;
		}
	
	//adding the book
		public Book addBook(Book b) {
			Book result =bookRepository.save(b);
			return result;
		}
	
	//delete book 
		public void deleteBook(int id) {
			bookRepository.deleteById(id);
		}
		
	//update book
		public void updateBook(Book b, int id) {
			b.setId(id);
			bookRepository.save(b);
		}
}
