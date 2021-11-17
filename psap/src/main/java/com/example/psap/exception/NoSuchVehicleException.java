package com.example.psap.exception;


	public class NoSuchVehicleException extends RuntimeException {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public NoSuchVehicleException(String msg) 
		{
			super(msg);
		}
	}

