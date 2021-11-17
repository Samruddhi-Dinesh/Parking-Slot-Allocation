package com.example.psap.Advice;


	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.ControllerAdvice;
	import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.psap.exception.NoSuchParkingSlotException;
import com.example.psap.exception.NoSuchPaymentFoundException;



	@ControllerAdvice
	public class PaymentControllerAdvice {
		
		@ExceptionHandler(NoSuchPaymentFoundException.class)
		public ResponseEntity<String> handleNosuchPaymentFound(NoSuchPaymentFoundException PaymentNotFoundException)
		{
			return new ResponseEntity<String>("Payment with given Id Is Not Available",HttpStatus.NOT_FOUND);
		}
		
		@ExceptionHandler(NoSuchParkingSlotException.class)
			public ResponseEntity<String> handleNoSuchParkingSlot(NoSuchParkingSlotException parkingslotnotavailableException)
			{
			return new  ResponseEntity<String>("ParkingSlot with given Id Is Not Available",HttpStatus.NOT_FOUND);
			}
		
	}

