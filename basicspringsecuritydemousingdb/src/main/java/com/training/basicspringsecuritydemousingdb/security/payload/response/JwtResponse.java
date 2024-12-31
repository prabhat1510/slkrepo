package com.training.basicspringsecuritydemousingdb.security.payload.response;

import java.util.List;


public class JwtResponse {
	private String accessToken;
	private String tokenType = "Bearer";
	private Long id;
	private String username;
	private String email;
	private List<String> roles;

	
	public JwtResponse() {
		// TODO Auto-generated constructor stub
	}


	public JwtResponse(String accessToken, String tokenType, Long id, String username, String email,
			List<String> roles) {
		this.accessToken = accessToken;
		this.tokenType = tokenType;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}


	public JwtResponse(String accessToken, Long id, String username, String email, List<String> roles) {
		this.accessToken = accessToken;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}


	public String getAccessToken() {
		return accessToken;
	}


	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}


	public String getTokenType() {
		return tokenType;
	}


	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<String> getRoles() {
		return roles;
	}


	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
	
}