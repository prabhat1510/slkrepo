package com.training.cafeapp.service;

import com.training.cafeapp.entities.Cafe;
import com.training.cafeapp.exceptions.CafeNotFoundException;

public interface CafeService {
	
	public String addNewCafe(Cafe cafe);
	public Cafe getCafeById(Integer cafeId) throws CafeNotFoundException;
	public Cafe getCafeByLocation(String location) throws CafeNotFoundException;
	public Cafe getCafeByName(String name) throws CafeNotFoundException;
	public Cafe getCafeByManager(String manager) throws CafeNotFoundException;
	

}
