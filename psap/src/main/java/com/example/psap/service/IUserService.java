package com.example.psap.service;



import java.util.List;

import com.example.psap.entity.Users;



public interface IUserService {
	public boolean login(String username,String password);
	 Users addUser(Users user);
	 Users updateUser( Integer user_id, Users user);
	 Users removeUser(Integer user_id);
	 List<Users> showAllUsers();
	 Users showUser(Integer user_id);
}