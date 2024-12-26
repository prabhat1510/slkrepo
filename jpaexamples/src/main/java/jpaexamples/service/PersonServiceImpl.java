package jpaexamples.service;

import java.util.List;

import jpaexamples.dao.PersonDAO;
import jpaexamples.dao.PersonDAOImpl;
import jpaexamples.entities.Person;

public class PersonServiceImpl implements PersonService {
	PersonDAO personDao = new PersonDAOImpl();

	public List<Person> getAllPerson() {

		return personDao.getAllPerson();
	}

	public Person getPersonById(Integer personNo) {
		return personDao.getPersonById(personNo);
	}

	public void addPerson(Person person) {
		personDao.addPerson(person);

	}

	public Person updatePerson(Person person) {
		return personDao.updatePerson(person);
	}

	public void deletePerson(Integer personId) {
		personDao.deletePerson(personId);

	}

	public Person getPersonByName(String personName) {
		return personDao.getPersonByName(personName);
	}

	public Integer updatePersonUsingQuery(Person person) {

		return personDao.updatePersonUsingQuery(person);
	}

	public void deletePersonByName(String personName) {
		personDao.deletePersonByName(personName);

	}

}
