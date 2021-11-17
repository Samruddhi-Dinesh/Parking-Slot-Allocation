package com.example.psap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.psap.entity.Admin;
import com.example.psap.entity.Login1;
import com.example.psap.service.IAdminService;



@RestController
@RequestMapping(value="/admin")
@CrossOrigin(origins="http://localhost:3000")
public class AdminController 
{
	@Autowired
	private IAdminService adminService;
	
	@PostMapping(value="/add")
	public ResponseEntity<Admin> saveParkingPremise(@RequestBody Admin admin)
	{
		return new ResponseEntity<Admin>(adminService.saveParkingPremise(admin), HttpStatus.CREATED);
	}
	
	@PostMapping(value="/login1")
	public ResponseEntity<String> login1(@RequestBody Login1 login1) {
		
		Boolean isLoginSuccess=adminService.login1(login1.getUsername(),login1.getPassword());
		String msg="";
		if(isLoginSuccess)
		{
			msg="welcome "+login1.getUsername();
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		else
		{
			msg="Invalid Credential,Try Again";
			return new ResponseEntity<String>(msg,HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping(value="/getallAdmins")
	public ResponseEntity<List<Admin>> getAllAdmins()
	{
		List<Admin> allAdmins=adminService.getAllAdmins();
		return new ResponseEntity<List<Admin>>(allAdmins, HttpStatus.OK);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Optional<Admin>> getAdmin(@PathVariable Integer id)
	{
		Optional<Admin> adminById=adminService.getAdmin(id);
		return new ResponseEntity<Optional<Admin>>(adminById, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<String> deleteParkingPremise(@PathVariable Integer id)
	{
		adminService.deleteParkingPremise(id);
		String msg = "Admin with Id"+id+"Deleted Successfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Admin> updateParkingPremise(@PathVariable Integer id,@RequestBody Admin admin)
	{
		Admin updateParkingPremise = adminService.updateParkingPremise(id, admin);
		return new ResponseEntity<Admin>(updateParkingPremise,HttpStatus.CREATED);
	}
	
	
	
}