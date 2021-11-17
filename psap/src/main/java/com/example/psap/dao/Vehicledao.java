package com.example.psap.dao;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.psap.entity.Vehicle;
import com.example.psap.exception.DuplicateVehicleException;
import com.example.psap.exception.NoSuchVehicleException;


    @Repository
	public interface Vehicledao extends JpaRepository<Vehicle, Integer> {
	

   
       public Optional<Vehicle> findByVehicleNumber(String vehicleNumber) throws NoSuchVehicleException;

		
		@Query(value = "select v.* from Vehicle v where v.vehicle=?",nativeQuery = true)
		public boolean addUsersVehicle(Vehicle vehicle) throws DuplicateVehicleException;

		public void save(String vehicleNumber);
		
		@Transactional
	    @Modifying
		public void deleteByVehicleNumber(String vehicleNumber);
		
	} 

