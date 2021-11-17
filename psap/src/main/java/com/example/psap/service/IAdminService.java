package com.example.psap.service;

import java.util.List;
import java.util.Optional;

import com.example.psap.entity.Admin;

public interface IAdminService {

	public boolean login1(String username,String password);
	
	public Admin saveParkingPremise(Admin admin);
	
    public List<Admin> getAllAdmins();
	
	public Optional<Admin> getAdmin(Integer id);
	
	public Admin deleteParkingPremise(Integer id);
	
	public Admin updateParkingPremise(Integer id, Admin admin);
	


}