package com.vasanth.microservice.microserviceproject.controller;

import com.vasanth.microservice.microserviceproject.entity.Person;
import com.vasanth.microservice.microserviceproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;


    //to list all person data
    @GetMapping("/person/list")
    public List<Person> allPersonList(){
        return personService.listOfPerson();
    }

    // to display a required person data
    @GetMapping("/person/{personId}")
    public Person retrievePerson(@PathVariable int personId){    //@RequestParam
        return personService.personDataById(personId);
    }

    //to create a person
    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person){
        return personService.addPerson(person);
    }

    @PostMapping("/person/{personId}")
    public Person updatePerson(@PathVariable int personId,@RequestBody Person person){
        Person existingPerson=personService.personDataById(personId);
        existingPerson.setId(personId);
        existingPerson.setFirstName(person.getFirstName());
        existingPerson.setLastName(person.getLastName());
        existingPerson.setCity(person.getCity());

        return personService.addPerson(existingPerson);
    }

    @DeleteMapping("/person/{personId}")
    public void deletePerson(@PathVariable int personId){
        personService.deletePersonById(personId);
    }



}
