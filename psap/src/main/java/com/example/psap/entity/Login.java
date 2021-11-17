package com.example.psap.entity;


import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;


public class Login {
	
	@Column
	@NotEmpty(message="Username is Required")
	private String username;
	@Column
	@NotEmpty(message="Password is Required")
	private String password;



public Login() {
	
}

public Login(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}



}