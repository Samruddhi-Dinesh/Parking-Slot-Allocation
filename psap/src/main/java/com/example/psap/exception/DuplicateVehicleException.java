package com.example.psap.exception;


public class DuplicateVehicleException extends RuntimeException {
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public DuplicateVehicleException() 
		{
			
		}
		public DuplicateVehicleException(String msg) 
		{
			super(msg);
		}
	}

