package com.training.cafeapp.onetoonebi;

public interface StudentBiService {
	public StudentBi createStudent(StudentBi student);
	public StudentBi retrieveStudent(Integer studentId);
	public void deleteStudentById(Integer studentId);
}
