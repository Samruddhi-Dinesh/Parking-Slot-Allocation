package com.example.psap.service;



	import java.util.Optional;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.psap.dao.PaymentDao;
import com.example.psap.entity.Payment;
import com.example.psap.exception.NoSuchPaymentFoundException;

	
	@Service
		public class PaymentServiceImpl implements IPaymentService {

			@Autowired
			private PaymentDao dao;
		
			

			@Override
			public Payment readPaymentById(long paymentId)throws NoSuchPaymentFoundException{
				Optional<Payment> opt=dao.findById(paymentId);
				if(opt.isPresent()) {
					Payment payment=opt.get();
					return payment;
				}
				else{
					throw new  NoSuchPaymentFoundException("No payment for this id");
				}
			
				
			}



			@Override
			public Payment parkingBookingPayment(Payment payment) {
				// TODO Auto-generated method stub

				Payment savePayment=dao.save(payment);
				return savePayment;

			}


		}

