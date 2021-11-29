package com.vasanth.microservice.microserviceproject.service;

import com.vasanth.microservice.microserviceproject.entity.Person;
import com.vasanth.microservice.microserviceproject.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepo;

    public Person personDataById(int id){
        return personRepo.findById(id).get();
    }

    public List<Person> listOfPerson() {
        return personRepo.findAll();
    }
}
