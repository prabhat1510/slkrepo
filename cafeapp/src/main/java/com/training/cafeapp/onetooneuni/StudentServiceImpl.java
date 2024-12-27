package com.training.cafeapp.onetooneuni;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studRepo;

	@Override
	public Student createStudent(Student student) {

		return studRepo.save(student);
	}

	@Override
	public Student retrieveStudent(Integer studentId) {
		Optional<Student> student = studRepo.findById(studentId);
		if(student.isPresent()) {
			return student.get();
		}
		return null;
	}

	@Override
	public void deleteStudentById(Integer studentId) {
		studRepo.deleteById(studentId);

	}

}
