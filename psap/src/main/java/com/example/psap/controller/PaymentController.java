package com.example.psap.controller;


	import javax.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.stereotype.Service;
	import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.example.psap.entity.Payment;
import com.example.psap.exception.NoSuchPaymentFoundException;
import com.example.psap.service.IPaymentService;

	

	@Service
	@ControllerAdvice
	@RestController
	@RequestMapping("/Payment")
	 @CrossOrigin(origins = "http://localhost:3000")
		public class PaymentController {
		

			@Autowired
			private IPaymentService pservice;

			@PostMapping(value="/savePayment")
			public ResponseEntity<String> parkingBookingPayment(@RequestBody Payment payment) {
				pservice.parkingBookingPayment(payment);
				String msg="Payment Added Successfully";
				return new ResponseEntity<String>(msg, HttpStatus.OK);
			}

			@GetMapping("/findbyid/{paymentId}")
			public ResponseEntity<Payment> fetchAllPaymentById(@Valid @PathVariable long paymentId) throws NoSuchPaymentFoundException {
				Payment p = pservice.readPaymentById(paymentId);
				return new ResponseEntity<Payment>(p,HttpStatus.OK);

			}


		}

