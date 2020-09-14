package com.valid.manuel.testbackendjava.dao;

import org.springframework.data.repository.CrudRepository;

import com.valid.manuel.testbackendjava.entity.Person;

public interface IPersonDao extends CrudRepository<Person, Long> {

}
