package com.example.psap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psap.dao.Vehicledao;
import com.example.psap.entity.Vehicle;
import com.example.psap.exception.DuplicateVehicleException;
import com.example.psap.exception.NoSuchVehicleException;

@Service
	public class VehicleServiceImpl implements IVehicleService{

		@Autowired
		 Vehicledao vehicleDao;
	
	
//add vehicle
		@Override
		public Vehicle addUsersVehicle(Vehicle vehicle) throws DuplicateVehicleException {
			return vehicleDao.save(vehicle);
		}


	
//find vehicle details by vehicle number		
		@Override
		public Vehicle findVehicleByVehicleNumber(String vehicleNumber)throws NoSuchVehicleException{

			
				Optional<Vehicle> opt=vehicleDao.findByVehicleNumber(vehicleNumber);
				if(opt.isPresent())
				{ 
					return opt.get();
				}
			else
				{

					throw new NoSuchVehicleException("No Such Vehicle");
			} 

		}
		
		@Override
		public List<Vehicle> getallvehicles() {
			return vehicleDao.findAll();
		}

    


		@Override
		public void removeVehicleByVehicleNumber(String vehicleNumber) {
			 vehicleDao.deleteByVehicleNumber(vehicleNumber);
		}
		
		

	
		
	


	


		
}

