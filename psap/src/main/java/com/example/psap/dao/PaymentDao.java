package com.example.psap.dao;




	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.example.psap.entity.Payment;



	@Repository
		public interface PaymentDao extends JpaRepository <Payment, Long>{
			
			
		}

