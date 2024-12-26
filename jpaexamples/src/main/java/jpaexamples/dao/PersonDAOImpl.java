package jpaexamples.dao;

import java.util.List;

import org.hibernate.Session;

import jakarta.persistence.TypedQuery;
import jpaexamples.entities.Person;
import jpaexamples.utility.HibernateUtility;

public class PersonDAOImpl implements PersonDAO {
	
	public PersonDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	private Session session = HibernateUtility.getSessionFactory().openSession();
	public List<Person> getAllPerson() {
		session.beginTransaction();
		TypedQuery<Person> query = session.createQuery("select p from Person p",Person.class);
		
		List<Person>  listOfPerson = query.getResultList();
		session.getTransaction().commit();
		return listOfPerson;
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
		session.beginTransaction();
		Person person = new Person();
		person.setPersonId(personId);
		session.remove(person);
		session.getTransaction().commit();

	}

	//Retrieving data or entity Person from DB on non primary key
	public Person getPersonByName(String personName) {
		session.beginTransaction();
		TypedQuery<Person> query = session.createQuery("select p from Person p where p.personName=:personName",Person.class);
		query.setParameter("personName", personName);

		Person  person = query.getSingleResult();
		session.getTransaction().commit();
		return person;
	
	}

	public Integer updatePersonUsingQuery(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletePersonByName(String personName) {
		// TODO Auto-generated method stub

	}

}
