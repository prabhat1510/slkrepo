package com.training.restapiunittestdemo.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.restapiunittestdemo.entities.Student;
import com.training.restapiunittestdemo.exceptions.StudentNotFoundException;

@SpringBootTest
public class StudentServiceImplTests {
	
	@Autowired
	private StudentService service;

	@Test
	void testGetStudent() {
		Student student = null;
		try {
			student = service.getStudentById(2);
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertNotNull(student);
		assertTrue(student.getStudentName().equals("Sujan"));
		
	}
	
	@Test
	void testGetStudentThrowingException() {
		assertThatThrownBy(()->service.getStudentById(21)).isInstanceOf(StudentNotFoundException.class);
	}
	
	@Test
	void testAddNewStudent() {
		Student newStudent = new Student(3,"Rohan");
		Student savedStudent = service.addNewStudent(newStudent);
		assertNotNull(savedStudent);
		assertTrue(savedStudent.getStudentName().equals(newStudent.getStudentName()));
		assertTrue(savedStudent.getStudentId() == newStudent.getStudentId());
	}
	
	
}
