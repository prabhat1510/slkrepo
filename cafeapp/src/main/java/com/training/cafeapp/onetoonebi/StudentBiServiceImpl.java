package com.training.cafeapp.onetoonebi;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentBiServiceImpl implements StudentBiService {

	@Autowired
	private StudentBiRepository studRepo;

	@Override
	public StudentBi createStudent(StudentBi student) {

		return studRepo.save(student);
	}

	@Override
	public StudentBi retrieveStudent(Integer studentId) {
		Optional<StudentBi> student = studRepo.findById(studentId);
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
