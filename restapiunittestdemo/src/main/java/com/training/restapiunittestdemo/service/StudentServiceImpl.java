package com.training.restapiunittestdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.restapiunittestdemo.entities.Student;
import com.training.restapiunittestdemo.exceptions.StudentNotFoundException;
import com.training.restapiunittestdemo.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repo;
	@Override
	public Student addNewStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public Student getStudentById(Integer studentId) throws StudentNotFoundException {
		Optional<Student> student = repo.findById(studentId);
		if(student.isPresent()) {
			return student.get();
		}else {
			throw new StudentNotFoundException("Student with student id "+studentId+" not found");
		}
	}

	@Override
	public String deleteStudentById(Integer studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
