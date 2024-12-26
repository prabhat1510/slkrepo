package jpaexamples.main;

import jpaexamples.entities.Person;
import jpaexamples.service.PersonService;
import jpaexamples.service.PersonServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		PersonService personService = new PersonServiceImpl();
		//Create a person
		Person person = new Person();
		person.setPersonName("John");
		personService.addPerson(person);

	}

}
