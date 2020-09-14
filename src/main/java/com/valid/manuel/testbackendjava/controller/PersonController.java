package com.valid.manuel.testbackendjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valid.manuel.testbackendjava.entity.Person;
import com.valid.manuel.testbackendjava.service.PersonService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    private List<Person> getPersons() {
        return personService.getPersons();
    }

	@PostMapping("/persons")
	private Person addPerson(@RequestBody Person person)  {
		return personService.addPerson(person);
	}

	@PutMapping("/persons")
	private List<Person> updatePersons(@RequestBody List<Person> persons)  {
		return personService.updatePersons(persons);
	}
}
