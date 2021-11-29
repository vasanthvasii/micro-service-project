package com.vasanth.microservice.microserviceproject.repository;

import com.vasanth.microservice.microserviceproject.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
