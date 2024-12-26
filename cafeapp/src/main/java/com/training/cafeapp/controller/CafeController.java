package com.training.cafeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.cafeapp.entities.Cafe;
import com.training.cafeapp.exceptions.CafeNotFoundException;
import com.training.cafeapp.service.CafeService;

@RestController
@RequestMapping("/api")
public class CafeController {
	
	@Autowired
	private CafeService cafeService;
	
	//http://localhost:8080/api/cafe?id=1
	@GetMapping("/cafe")
	public ResponseEntity<Cafe> getCafeById(@RequestParam("id") Integer cafeId) throws CafeNotFoundException{
		Cafe cafe = cafeService.getCafeById(cafeId);
		return new ResponseEntity<Cafe>(cafe,HttpStatus.FOUND);
	}

	@PostMapping("/cafe/new")
	public ResponseEntity<String> addNewCafe(@RequestBody Cafe cafe){
		String message = cafeService.addNewCafe(cafe);
		return new ResponseEntity<String>(message,HttpStatus.CREATED);
	}
}
