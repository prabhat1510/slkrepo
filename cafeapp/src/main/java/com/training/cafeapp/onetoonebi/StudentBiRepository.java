package com.training.cafeapp.onetoonebi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentBiRepository extends CrudRepository<StudentBi, Integer> {

}
