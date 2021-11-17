package com.example.psap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
	@Table
	public class ParkingPremise {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name ="parking_Premise_Id")
		private int parkingPremiseId;
		
        @Column
		private String parkingPremiseName;
		
    	@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "premiseAdress_fk",referencedColumnName = "address_Id")
		private Address premiseAddress;
        
		private int numberOfParkingFloors;
		
		// Constructors, Getter & Setter method
		public ParkingPremise() {
			super();
		}
		
		public ParkingPremise(int parkingPremiseId, String parkingPremiseName, Address premiseAddress,
				int numberOfParkingFloors) {
			super();
			this.parkingPremiseId = parkingPremiseId;
			this.parkingPremiseName = parkingPremiseName;
			this.premiseAddress = premiseAddress;
			this.numberOfParkingFloors = numberOfParkingFloors;
		}

		public int getParkingPremiseId() {
			return parkingPremiseId;
		}

		public void setParkingPremiseId(int parkingPremiseId) {
			this.parkingPremiseId = parkingPremiseId;
		}

		public String getParkingPremiseName() {
			return parkingPremiseName;
		}

		public void setParkingPremiseName(String parkingPremiseName) {
			this.parkingPremiseName = parkingPremiseName;
		}

		public Address getPremiseAddress() {
			return premiseAddress;
		}

		public void setPremiseAddress(Address premiseAddress) {
			this.premiseAddress = premiseAddress;
		}

		public int getNumberOfParkingFloors() {
			return numberOfParkingFloors;
		}

		public void setNumberOfParkingFloors(int numberOfParkingFloors) {
			this.numberOfParkingFloors = numberOfParkingFloors;
		}
		
		
		
		
	}

