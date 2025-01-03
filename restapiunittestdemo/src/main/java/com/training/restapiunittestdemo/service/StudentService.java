package com.training.restapiunittestdemo.service;

import com.training.restapiunittestdemo.entities.Student;
import com.training.restapiunittestdemo.exceptions.StudentNotFoundException;

public interface StudentService {
	
	//Create
	public Student addNewStudent(Student student);
	//Retrieve
	public Student getStudentById(Integer studentId) throws StudentNotFoundException;
	//Delete
	public String deleteStudentById(Integer studentId) throws StudentNotFoundException;
	//Update
	public Student updateStudent(Student student);
}
