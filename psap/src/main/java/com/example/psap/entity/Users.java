package com.example.psap.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_id;

	@Column
	@NotEmpty(message = "User Name is Required")
	private String username; 
	
	@Column(unique=true,nullable=false)
	@NotEmpty(message = "Email is Required")
	private String email;

	@Column
	@NotEmpty(message = "Password is Required")
	@Size(min=4,max=15)
	private String password;


	@Column
	@NotEmpty(message = "Mobile number is Required")
	@Size(min=10,max=10)
	private String mobile;

  

	public Users() {

	}

	public Users(Integer user_id, String username, String email, String password, String role, String mobile,
			String address)
	
	{
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobile = mobile;

		
	}

	public Users(String username, String email, String password, String role, String mobile, String address)
	
	{
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


}