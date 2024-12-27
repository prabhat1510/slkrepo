package com.training.cafeapp.onetooneuni;

public interface StudentService {
	public Student createStudent(Student student);
	public Student retrieveStudent(Integer studentId);
	public void deleteStudentById(Integer studentId);
}
