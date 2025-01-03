package com.training.restapiunittestdemo.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.restapiunittestdemo.entities.Student;

@SpringBootTest
public class StudentRepositoriesTests {

	@Autowired
	private StudentRepository repo;

	@Test
	void testRepoNotNull() {
		assertNotNull(repo);
	}

	@Test
	public void testRetrieveStudentById() {
		Integer studentId = 1;
		Optional<Student> student = repo.findById(studentId);
		assertNotNull(student.get());
		assertEquals("Sanjay", student.get().getStudentName(), "Student is present");
	}

	@Test
	public void testAddNewStudent() {
		Student student = new Student();
		student.setStudentId(2);
		student.setStudentName("Sujan");

		Student stud = repo.save(student);

		assertNotNull(stud);
		assertEquals(student.getStudentName(), stud.getStudentName(), "Student added successfully");
	}

}
