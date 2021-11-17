package com.example.psap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psap.dao.AdminRepository;
import com.example.psap.entity.Admin;




@Service
public class AdminServiceImplement implements IAdminService{
@Autowired
private AdminRepository adminRepo;

@Override
public boolean login1(String username, String password) {
	Optional<Admin> opt=adminRepo.findByUsernameAndPassword(username, password);
	if(opt.isPresent())
	{
		return true;
	}
	return false;

}

@Override
public Admin saveParkingPremise(Admin admin) {
	// TODO Auto-generated method stub
	return adminRepo.save(admin);
}

@Override
public List<Admin> getAllAdmins() {
	// TODO Auto-generated method stub
	return adminRepo.findAll();
}



@Override
public Optional<Admin> getAdmin(Integer id) {
	// TODO Auto-generated method stub
	return adminRepo.findById(id);
}

@Override
public Admin deleteParkingPremise(Integer id) {
	// TODO Auto-generated method stub
	adminRepo.deleteById(id);
	return null;
}

@Override
public Admin updateParkingPremise(Integer id, Admin admin) {
	// TODO Auto-generated method stub
	Optional<Admin> existingAdmin=adminRepo.findById(id);
	if(existingAdmin.isPresent())
	{
		Admin admin1=existingAdmin.get();
		admin1.setUsername(admin.getUsername());
		admin1.setPassword(admin.getPassword());
		return adminRepo.save(admin1);
	}
	else
	{
	return adminRepo.save(admin);
	}
}

}