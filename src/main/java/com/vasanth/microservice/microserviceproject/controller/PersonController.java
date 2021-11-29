package com.vasanth.microservice.microserviceproject.controller;

import com.vasanth.microservice.microserviceproject.entity.Person;
import com.vasanth.microservice.microserviceproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;


    //to list all person data
    @GetMapping("/person/list")
    public ResponseEntity<List<Person>> allPersonList(){
        return new ResponseEntity<List<Person>>(personService.listOfPerson(),HttpStatus.OK);
    }

    // to display a required person data
    @GetMapping("/person/{personId}")
    public ResponseEntity<Person> retrievePerson(@PathVariable int personId){    //@RequestParam
        //return personService.personDataById(personId);
        Person person=personService.personDataById(personId);
        return new ResponseEntity<Person>(person,HttpStatus.OK);
    }

    //to create a person
    @PostMapping("/person")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        return new ResponseEntity<Person>(personService.addPerson(person),HttpStatus.CREATED);
    }

    @PutMapping("/person/{personId}")
    public ResponseEntity<Person> updatePerson(@PathVariable int personId,@RequestBody Person person){
        Person existingPerson=personService.personDataById(personId);
        existingPerson.setId(personId);
        existingPerson.setFirstName(person.getFirstName());
        existingPerson.setLastName(person.getLastName());
        existingPerson.setCity(person.getCity());

        return new ResponseEntity<Person>(personService.addPerson(existingPerson),HttpStatus.OK);
    }

    @DeleteMapping("/person/{personId}")
    public void deletePerson(@PathVariable int personId){
        personService.deletePersonById(personId);
    }



}
