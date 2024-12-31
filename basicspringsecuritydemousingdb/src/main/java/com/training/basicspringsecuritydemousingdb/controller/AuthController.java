package com.training.basicspringsecuritydemousingdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.basicspringsecuritydemousingdb.entities.UserEntity;
import com.training.basicspringsecuritydemousingdb.repositories.UserRepository;
import com.training.basicspringsecuritydemousingdb.security.payload.request.SignupRequest;
import com.training.basicspringsecuritydemousingdb.security.payload.response.MessageResponse;

import jakarta.validation.Valid;

@RestController
public class AuthController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder encoder;
	/*
	 * @PostMapping("/signin") public ResponseEntity<?>
	 * authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
	 * 
	 * }
	 */

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
		if (userRepository.existsByUsername(signUpRequest.getUsername())) {
			return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already taken!"));
		}

		if (userRepository.existsByEmail(signUpRequest.getEmail())) {
			return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already in use!"));
		}
		// Create new user's account
		UserEntity user = new UserEntity(signUpRequest.getUsername(), signUpRequest.getEmail(),
				encoder.encode(signUpRequest.getPassword()));
		
		//TODO Add roles and other properties
		
		user.setRoles(null);
		user.setAddress(signUpRequest.getAddress());
		user.setEmail(signUpRequest.getEmail());
		user.setMobile(signUpRequest.getMobile());
		user.setGender(signUpRequest.getGender());
		// saving UserEntity to the database
		userRepository.save(user);

		return ResponseEntity.ok(new MessageResponse("User registered successfully!"));

	}
}
