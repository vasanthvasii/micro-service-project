package com.vasanth.microservice.microserviceproject.controller;

import com.vasanth.microservice.microserviceproject.entity.Person;
import com.vasanth.microservice.microserviceproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;


    @GetMapping("/list")
    public List<Person> personList(){
        return personService.listOfPerson();
    }
    @GetMapping("/{personId}")
    public Person findPerson(@PathVariable int personId){
        return personService.personDataById(personId);
    }


}
