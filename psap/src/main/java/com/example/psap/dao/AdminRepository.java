package com.example.psap.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.psap.entity.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	public Optional<Admin> findByUsernameAndPassword(String username,String password);
	
	

}