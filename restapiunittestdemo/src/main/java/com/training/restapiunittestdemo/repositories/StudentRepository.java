package com.training.restapiunittestdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.restapiunittestdemo.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
