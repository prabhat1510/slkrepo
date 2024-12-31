package com.training.basicspringsecuritydemousingdb.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.basicspringsecuritydemousingdb.entities.ERole;
import com.training.basicspringsecuritydemousingdb.entities.Role;
import com.training.basicspringsecuritydemousingdb.entities.UserEntity;
import com.training.basicspringsecuritydemousingdb.repositories.RoleRepository;
import com.training.basicspringsecuritydemousingdb.repositories.UserRepository;
import com.training.basicspringsecuritydemousingdb.security.payload.request.SignupRequest;
import com.training.basicspringsecuritydemousingdb.security.payload.response.MessageResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
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
		
		//Add roles and other properties
		user.setRoles(getRoles(signUpRequest));
		user.setAddress(signUpRequest.getAddress());
		user.setEmail(signUpRequest.getEmail());
		user.setMobile(signUpRequest.getMobile());
		user.setGender(signUpRequest.getGender());
		// saving UserEntity to the database
		userRepository.save(user);

		return ResponseEntity.ok(new MessageResponse("User registered successfully!"));

	}
	
	//Get Roles from DB if not present in SignupRequest
	public Set<Role> getRoles(SignupRequest signupRequest){
		Set<String> strRoles = signupRequest.getRole();
		Set<Role> roles = new HashSet<>();

		if (strRoles == null) {
			Role userRole = roleRepository.findByName(ERole.ROLE_USER)
					.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
			roles.add(userRole);
		} else {
			strRoles.forEach(role -> {
				switch (role) {
				case "admin":
					Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(adminRole);

					break;
				case "child":
					Role childRole = roleRepository.findByName(ERole.ROLE_CHILD)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(childRole);

					break;
				case "parent":
					Role parentRole = roleRepository.findByName(ERole.ROLE_PARENT)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(parentRole);

					break;
				default:
					Role userRole = roleRepository.findByName(ERole.ROLE_USER)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(userRole);
				}
			});
		}
		return roles;
	}
}
