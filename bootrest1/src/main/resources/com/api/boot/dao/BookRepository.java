package com.api.boot.dao;

public interface BookRepository extends CrudRepository<Book, Integer>{
	public Book findById(int id);
	
}
