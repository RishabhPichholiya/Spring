package com.api.book3.dao;


import org.springframework.data.repository.CrudRepository;

import com.api.book3.entites.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	public Book findById(int id);
}
