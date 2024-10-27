package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.jpa.test.entities.User;
import com.jpa.test.dao.UserReository;
@SpringBootApplication
public class Projectjpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Projectjpa1Application.class, args);
		UserReository userRepository= context.getBean(UserReository.class);
		
		//Saving single User
		//User user=new User();
		//user.setName("Rishabh");
		//user.setCity("Ratlam");
		//user.setStatus("I am a Programmer");
		//userRepository.save(user);
		//User user1 = userRepository.save(user);
		
		/*
		 * //Saving Multiple Objects User user1 = new User();
		 * user1.setName("Shubh Pamecha"); user1.setCity("Ratlam");
		 * user1.setStatus("I am a Python Programmer");
		 * 
		 * User user2 = new User(); user2.setName("Viti"); user2.setCity("Texas");
		 * user2.setStatus("I am a Java Programmer");
		 * 
		 * List <User> users =List.of(user1, user2); Iterable <User> result =
		 * userRepository.saveAll(users); result.forEach(user->{
		 * System.out.println(user);});
		 */
		
		//Update the user 
		
		/*
		 * Optional <User> optional = userRepository.findById(53); User user
		 * =optional.get(); user.setName("Viti Bhandari"); User result1 =
		 * userRepository.save(user); System.out.println(result1);
		 */
		 
		 
		 //How to use findAll
			/*
			 * Iterable <User> itr =userRepository.findAll(); //Iterator <User> iterator
			 * =itr.iterator(); itr.forEach(user->System.out.println(user));
			 */
		 
		
		// Delete the user element
		/*
		 * userRepository.deleteById(53); System.out.println("Deleted");
		 */
		
		//Delete all elements
		/*
		 * Iterable <User> itr =userRepository.findAll(); userRepository.deleteAll(itr);
		 */
		
		List<User> users =userRepository.findByName("Rishabh");
		users.forEach(e->System.out.println(e));
		
		List<User> users1 =userRepository.findByNameAndCity("Rishabh", "Ratlam");
		users1.forEach(e->System.out.println(e));
		}

}
