package com.training.cafeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.cafeapp.entities.Cafe;

//@Repository
public interface CafeRepository extends CrudRepository<Cafe, Integer> {

}
