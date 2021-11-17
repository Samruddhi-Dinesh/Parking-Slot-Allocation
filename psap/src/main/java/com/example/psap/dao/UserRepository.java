package com.example.psap.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.psap.entity.Users;


public interface UserRepository extends JpaRepository<Users,Integer> {
	
	public Optional<Users> findByUsernameAndPassword(String username,String password);
	



	}