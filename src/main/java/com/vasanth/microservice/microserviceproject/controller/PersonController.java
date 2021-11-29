package com.vasanth.microservice.microserviceproject.controller;

import com.vasanth.microservice.microserviceproject.entity.Person;
import com.vasanth.microservice.microserviceproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Person retrievePerson(@PathVariable int personId){    //@RequestParam
        return personService.personDataById(personId);
    }


}
