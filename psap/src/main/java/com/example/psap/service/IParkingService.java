package com.example.psap.service;

import java.util.Date;
import java.util.List;

import com.example.psap.entity.ParkingSlots;
import com.example.psap.exception.NoSuchParkingSlotException;
import com.example.psap.exception.ParkingSlotNotAvailableException;

public interface IParkingService {
	public ParkingSlots getParkingSlotsById(Integer parkingSlotId) throws NoSuchParkingSlotException;
	public ParkingSlots bookParkingSlots(ParkingSlots parkingslot);
	public boolean checkAvailability(Date date, String time) throws ParkingSlotNotAvailableException;
	public void cancelParkingSlotBooking(Integer parkingSlotId) throws NoSuchParkingSlotException;
	public List<ParkingSlots> getAllParkingSlots();
	
	


	
}



