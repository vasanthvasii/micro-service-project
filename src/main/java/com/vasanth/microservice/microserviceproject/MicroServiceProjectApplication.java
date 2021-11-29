package com.vasanth.microservice.microserviceproject;

import com.vasanth.microservice.microserviceproject.entity.Order;
import com.vasanth.microservice.microserviceproject.entity.Person;
import com.vasanth.microservice.microserviceproject.repository.OrderRepository;
import com.vasanth.microservice.microserviceproject.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServiceProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProjectApplication.class, args);
	}

	@Autowired
	PersonRepository personRepository;

	@Autowired
	OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		Person p1 = new Person("Vasanth","Shetty","Chikmagalur");
		personRepository.save(p1);
		Person p2 = new Person("Vijeth","Gowda","Mudigere");
		personRepository.save(p2);
		Person p3 = new Person("Guruprasad","Shetty","Chikmagalur");
		personRepository.save(p3);

		Order ord1=new Order(1,"1-1-1",1000);
		orderRepository.save(ord1);
		Order ord2=new Order(2,"1-1-1",1000);
		orderRepository.save(ord2);
		Order ord3=new Order(3,"1-1-1",1000);
		orderRepository.save(ord3);

	}
}
