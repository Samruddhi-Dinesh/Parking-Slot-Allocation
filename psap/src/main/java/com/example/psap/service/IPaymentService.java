package com.example.psap.service;


	import com.example.psap.entity.Payment;
    import com.example.psap.exception.NoSuchPaymentFoundException;

	
	
		public interface IPaymentService {
			public Payment parkingBookingPayment(Payment payment);
			public Payment readPaymentById(long paymentId) throws NoSuchPaymentFoundException;
		

		}

