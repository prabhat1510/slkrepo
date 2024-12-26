package jpaexamples.service;

import java.util.List;

import jpaexamples.entities.Person;

public interface PersonService {
	public List<Person> getAllPerson();

	public Person getPersonById(Integer personId);

	public void addPerson(Person person);

	public Person updatePerson(Person person);

	public void deletePerson(Integer personId);

	public Person getPersonByName(String personName);

	public Integer updatePersonUsingQuery(Person person);

	public void deletePersonByName(String personName);
}
