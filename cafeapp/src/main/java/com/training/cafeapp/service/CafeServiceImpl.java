package com.training.cafeapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.cafeapp.entities.Cafe;
import com.training.cafeapp.exceptions.CafeNotFoundException;
import com.training.cafeapp.repositories.CafeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CafeServiceImpl implements CafeService {

	@Autowired
	private CafeRepository cafeRepo;
	

	public String addNewCafe(Cafe cafe) {
		Cafe c = cafeRepo.save(cafe);
		if(c.getCafeId() != 0) {
			return "Cafe added successfully";
		}else {
			return "Unable to add Cafe";
		}
	}


	public Cafe getCafeById(Integer cafeId) throws CafeNotFoundException{
		Optional<Cafe> cafe = cafeRepo.findById(cafeId);
		if(cafe.isPresent()) {
			return cafe.get();
		}else {
			throw new CafeNotFoundException("Cafe with cafe id "+cafeId+" not found in our record");
		}
	
	}


	@Override
	public Cafe getCafeByLocation(String location) throws CafeNotFoundException {
		Optional<Cafe> cafe = cafeRepo.findByLocation(location);
		if(cafe.isPresent()) {
			return cafe.get();
		}else {
			throw new CafeNotFoundException("Cafe with cafe location "+location+" not found in our record");
		}
	}


	@Override
	public Cafe getCafeByName(String name) throws CafeNotFoundException {
		Optional<Cafe> cafe = cafeRepo.findByCafeName(name);
		if(cafe.isPresent()) {
			return cafe.get();
		}else {
			throw new CafeNotFoundException("Cafe with cafe name "+name+" not found in our record");
		}
	}


	@Override
	public Cafe getCafeByManager(String manager) throws CafeNotFoundException {
		Optional<Cafe> cafe = cafeRepo.findByManager(manager);
		if(cafe.isPresent()) {
			return cafe.get();
		}else {
			throw new CafeNotFoundException("Cafe with cafe manager "+manager+" not found in our record");
		}
	}

}
