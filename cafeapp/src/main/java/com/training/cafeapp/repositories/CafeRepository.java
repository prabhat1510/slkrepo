package com.training.cafeapp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.cafeapp.entities.Cafe;

@Repository
public interface CafeRepository extends CrudRepository<Cafe, Integer> {
		
	public Optional<Cafe> findByCafeName(String cafeName);
	public Optional<Cafe> findByLocation(String location);
	public Optional<Cafe> findByManager(String manager);
}
