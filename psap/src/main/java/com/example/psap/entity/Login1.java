package com.example.psap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Login1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@NotEmpty(message = "User Name is Required")
	private String username;
	@Column
	@NotEmpty(message = "Password is Required")
	private String password;



public Login1() {
	
}

public Login1(String username, String password) {
	
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