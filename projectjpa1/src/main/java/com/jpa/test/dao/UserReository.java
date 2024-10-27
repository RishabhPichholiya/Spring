package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;

public interface UserReository extends CrudRepository<User, Integer>{
public List<User> findByName(String name);
public List<User> findByNameAndCity(String name,String city);
@Query
public List<User> getAllUser();
}
