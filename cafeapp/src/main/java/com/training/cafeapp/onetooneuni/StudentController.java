package com.training.cafeapp.onetooneuni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService service ;
	
	@PostMapping("/newstudent")
	public Student newStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@GetMapping("/student")
	public Student getStudent(@RequestParam("id") Integer studentId) {
		return service.retrieveStudent(studentId);
	}
	
	@DeleteMapping("/remove/{id}")
	public String deleteStudent(@PathVariable("id")Integer studentId) {
		service.deleteStudentById(studentId);
		return "Student deleted successfully";
	}
}
