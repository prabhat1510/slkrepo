package jpaexamples.dao;

import java.util.List;

import org.hibernate.Session;

import jpaexamples.entities.Person;
import jpaexamples.utility.HibernateUtility;

public class PersonDAOImpl implements PersonDAO {
	
	public PersonDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	private Session session = HibernateUtility.getSessionFactory().openSession();
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	public Person getPersonById(Integer personId) {
		session.beginTransaction();
		Person person = (Person) session.get(Person.class, personId);
		session.getTransaction().commit();
		return person;
	}

	public void addPerson(Person person) {
		session.beginTransaction();
		session.persist(person);
		session.getTransaction().commit();
		
	}

	public Person updatePerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletePerson(Integer personId) {
		// TODO Auto-generated method stub

	}

	public Person getPersonByName(String personName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer updatePersonUsingQuery(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletePersonByName(String personName) {
		// TODO Auto-generated method stub

	}

}
