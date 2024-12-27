package com.training.cafeapp.onetoonebi;

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
@RequestMapping("/api/bi")
public class StudentBiController {

	@Autowired
	private StudentBiService service ;
	
	@PostMapping("/newstudent")
	public StudentBi newStudent(@RequestBody StudentBi student) {
		return service.createStudent(student);
	}
	
	@GetMapping("/student")
	public StudentBi getStudent(@RequestParam("id") Integer studentId) {
		return service.retrieveStudent(studentId);
	}
	
	@DeleteMapping("/remove/{id}")
	public String deleteStudent(@PathVariable("id")Integer studentId) {
		service.deleteStudentById(studentId);
		return "StudentBi deleted successfully";
	}
}
