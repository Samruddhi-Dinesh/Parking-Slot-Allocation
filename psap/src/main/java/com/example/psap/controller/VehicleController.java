package com.example.psap.controller;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.example.psap.entity.Vehicle;
import com.example.psap.service.IVehicleService;

	
	@RestController 
	@RequestMapping(value = "/vehicle")
	 @CrossOrigin(origins = "http://localhost:3000")
	public class VehicleController {
		
		@Autowired
		private IVehicleService vehicleService;
		
		
		//add vehicles
		@PostMapping("/addvehicle")
		public ResponseEntity<Vehicle> addvehicle(@RequestBody Vehicle vehicle)
		{
			return new ResponseEntity<Vehicle>(vehicleService.addUsersVehicle(vehicle),HttpStatus.CREATED);
		
		}
		
		//find vehicle by vehicle number
				@GetMapping("{vehicleNumber}")
				public Vehicle fetchVehicleByVehicleNumber(@PathVariable String vehicleNumber){
					return vehicleService.findVehicleByVehicleNumber(vehicleNumber);
				}

		@GetMapping(value = "/getallvehicles")
		public ResponseEntity<List<Vehicle>> getAllVehicle() {
			List<Vehicle> v = vehicleService.getallvehicles();
			return new ResponseEntity<List<Vehicle>>(v, HttpStatus.OK);
		}

		//remove vehicle by vehicle number
				@DeleteMapping(value = "/deletevehicle/{vehicleNumber}")
				public ResponseEntity<String> deletevehicle(@PathVariable String vehicleNumber) {
					vehicleService.removeVehicleByVehicleNumber(vehicleNumber);
					String msg = "Vehicle with number: " + vehicleNumber + " Deleted Successfully";
					return new ResponseEntity<String>(msg, HttpStatus.OK);
					
				}
	}
	
	
