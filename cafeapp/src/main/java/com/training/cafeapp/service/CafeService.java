package com.training.cafeapp.service;

import com.training.cafeapp.entities.Cafe;
import com.training.cafeapp.exceptions.CafeNotFoundException;

public interface CafeService {
	
	public String addNewCafe(Cafe cafe);
	public Cafe getCafeById(Integer cafeId) throws CafeNotFoundException;

}
