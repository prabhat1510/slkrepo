package jpaexamples.dao;

import java.util.List;

import jpaexamples.entities.Person;

public interface PersonDAO {
	public List<Person> getAllPerson();

	public Person getPersonById(Integer personId);

	public void addPerson(Person person);

	public Person updatePerson(Person person);

	public void deletePerson(Integer personId);

	public Person getPersonByName(String personName);

	public Integer updatePersonUsingQuery(Person person);

	public void deletePersonByName(String personName);
}
