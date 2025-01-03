package com.training.restapiunittestdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.restapiunittestdemo.entities.Student;
import com.training.restapiunittestdemo.exceptions.StudentNotFoundException;
import com.training.restapiunittestdemo.service.StudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	//Create
	@PostMapping("/newstudent")
	public ResponseEntity<Student> addNewStudent(@RequestBody Student student) {
		 Student stud = service.addNewStudent(student);
		return new ResponseEntity<Student>(stud,HttpStatus.CREATED);
		
	}
	//Retrieve
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id")Integer studentId) throws StudentNotFoundException{
		 Student stud = service.getStudentById(studentId);
		 return new ResponseEntity<Student>(stud,HttpStatus.FOUND);
	}
	//Delete
	@DeleteMapping("/student/delete/{id}")
	public ResponseEntity<String> deleteStudentById( @PathVariable("id") Integer studentId) throws StudentNotFoundException{
		 String message = service.deleteStudentById(studentId);
		 return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	//Update
	@PutMapping("/updatestudent")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		 Student stud = service.addNewStudent(student);
			return new ResponseEntity<Student>(stud,HttpStatus.OK);
	}
}
