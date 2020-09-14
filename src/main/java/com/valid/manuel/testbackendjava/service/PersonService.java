package com.valid.manuel.testbackendjava.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valid.manuel.testbackendjava.dao.IPersonDao;
import com.valid.manuel.testbackendjava.entity.Person;

@Service
public class PersonService implements IPersonService {
	
	@Autowired
	private IPersonDao personDao;
	
	final AtomicInteger count = new AtomicInteger();
	
	/**
	 * Method to get all the person
	 * @return
	 */
	public List<Person> getPersons() {
		return (List<Person>) personDao.findAll();
	}

	@Override
	public Person addPerson(Person task) {
		task.setIndicted(false);
		return personDao.save(task);
	}
	
	@Override
	public List<Person> updatePersons(List<Person> persons) {	
		List<Person> list = new ArrayList<>();
		persons.forEach(person -> {
			if (person.getIndicted()) { 
				list.add(person);
			}
			personDao.save(person);
		});
		
		return list;
	}
}
