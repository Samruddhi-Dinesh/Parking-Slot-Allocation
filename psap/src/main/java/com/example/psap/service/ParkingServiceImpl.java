package com.example.psap.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psap.dao.ParkingSlotsDao;
import com.example.psap.entity.ParkingSlots;
import com.example.psap.exception.NoSuchParkingSlotException;
import com.example.psap.exception.ParkingSlotNotAvailableException;




@Service
public class ParkingServiceImpl implements IParkingService {
	
	@Autowired
	ParkingSlotsDao psdao;
	
	
	
	
	//book parking slot details
	@Override
	public ParkingSlots bookParkingSlots(ParkingSlots parkingslot) {
		return psdao.save(parkingslot);
	}

	//get slot by id
		@Override
		public ParkingSlots getParkingSlotsById(Integer parkingSlotId) throws NoSuchParkingSlotException {

			return psdao.findById(parkingSlotId)
					.orElseThrow(()-> new NoSuchParkingSlotException("ParkingSlot with Id " + parkingSlotId +" not found"));
		}

		
		 //p\cancel parking slot
		
		@Override
		public void cancelParkingSlotBooking(Integer parkingSlotId) throws NoSuchParkingSlotException {
		ParkingSlots ps = getParkingSlotsById(parkingSlotId);
		psdao.deleteById(ps.getParkingSlotId());
					
		}
		
		
		
		//get all Parking slots
			@Override
			public List<ParkingSlots> getAllParkingSlots() {
				
				return psdao.findAll();
			}

			
	
	//Check Slot availability 
	
		@Override
		public boolean checkAvailability(Date date, String time) throws ParkingSlotNotAvailableException {
			Optional<ParkingSlots> p = psdao.findByParkingDateAndParkingTime(date, time);
			if (p != null)
				return false;
			else
			return true;
		}
		
	  
	 
	



	
	

}

