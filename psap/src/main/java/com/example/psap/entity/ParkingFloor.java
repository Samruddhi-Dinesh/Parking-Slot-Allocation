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
	public class ParkingFloor {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "parking_Floor_Id")
		private int parkingFloorId;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "parkingPremise_fk",referencedColumnName = "parking_Premise_Id")
		private ParkingPremise parkingPremise;
		
		@Column
		private String floorNumber;
		@Column
		private int numberOfParkingSlots;
		
		
		public ParkingFloor() {
			super();
		}
		
		
		public ParkingFloor(int parkingFloorId, ParkingPremise parkingPremise, String floorNumber,
				int numberOfParkingSlots) {
			super();
			this.parkingFloorId = parkingFloorId;
			this.parkingPremise = parkingPremise;
			this.floorNumber = floorNumber;
			this.numberOfParkingSlots = numberOfParkingSlots;
		}

		public int getParkingFloorId() {
			return parkingFloorId;
		}

		public void setParkingFloorId(int parkingFloorId) {
			this.parkingFloorId = parkingFloorId;
		}

		public ParkingPremise getParkingPremise() {
			return parkingPremise;
		}

		public void setParkingPremise(ParkingPremise parkingPremise) {
			this.parkingPremise = parkingPremise;
		}

		public String getFloorNumber() {
			return floorNumber;
		}

		public void setFloorNumber(String floorNumber) {
			this.floorNumber = floorNumber;
		}

		public int getNumberOfParkingSlots() {
			return numberOfParkingSlots;
		}

		public void setNumberOfParkingSlots(int numberOfParkingSlots) {
			this.numberOfParkingSlots = numberOfParkingSlots;
		}


		@Override
		public String toString() {
			return "ParkingFloor [parkingFloorId=" + parkingFloorId + ", parkingPremise=" + parkingPremise
					+ ", floorNumber=" + floorNumber + ", numberOfParkingSlots=" + numberOfParkingSlots + "]";
		}
		
		
		
		
	}

