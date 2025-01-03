package com.training.restapiunittestdemo.service;

import org.springframework.stereotype.Service;

import com.training.restapiunittestdemo.entities.Student;
import com.training.restapiunittestdemo.exceptions.StudentNotFoundException;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public Student addNewStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(Integer studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
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
