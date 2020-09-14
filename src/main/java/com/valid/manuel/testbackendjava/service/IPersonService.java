package com.valid.manuel.testbackendjava.service;

import java.util.List;

import com.valid.manuel.testbackendjava.entity.Person;

public interface IPersonService {
	public List<Person> getPersons();
	public Person addPerson(Person person);
	public List<Person> updatePersons(List<Person> person);
}
