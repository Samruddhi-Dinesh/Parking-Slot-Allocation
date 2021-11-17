package com.example.psap.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psap.dao.UserRepository;
import com.example.psap.entity.Users;
import com.example.psap.exception.UserNotFoundException;



@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Users addUser(Users user) {
		return userRepository.save(user);
	}
	
	@Override
	public boolean login(String username, String password) {
		Optional<Users> opt=userRepository.findByUsernameAndPassword(username, password);
		if(opt.isPresent())
		{
			return true;
		}
		return false;

	}

	@Override
	public Users updateUser(Integer user_id, Users user) {
		Optional<Users> existingUser = userRepository.findById(user_id);
		if (existingUser.isPresent()) {
			Users user1 = existingUser.get();
			user1.setUsername(user.getUsername());
			user1.setEmail(user.getEmail());
			user1.setPassword(user.getPassword());
			user1.setMobile(user.getMobile());

			return userRepository.save(user1);
		} else {
			return userRepository.save(user);
		}
	}

	@Override
	public Users removeUser(Integer user_id) {
		Users user = showUser(user_id);
		userRepository.deleteById(user.getUser_id());
		return null;
	}

	@Override
	public List<Users> showAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Users showUser(Integer user_id) {
		return userRepository.findById(user_id)
				.orElseThrow(() -> new UserNotFoundException("User with Id " + user_id + " not found"));
	}


}