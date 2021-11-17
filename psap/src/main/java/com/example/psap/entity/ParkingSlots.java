package com.example.psap.entity;

import java.util.Date;

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
	@Table()
	public class ParkingSlots {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(unique=true,nullable=false)
		private int parkingSlotId;
		
		@Column
		private Date parkingDate;
		
		@Column
		private String parkingTime;
		
		@Column
		private int parkingDuration;
		
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name ="parkingFloor_fk",referencedColumnName = "parking_Floor_Id")
		private ParkingFloor parkingFloor;
		
	
        

		
		public ParkingSlots() {
			super();
		}
		
	
		
		
	

		public ParkingSlots(int parkingSlotId, Date parkingDate, String parkingTime, int parkingDuration,
				ParkingFloor parkingFloor) {
			super();
			this.parkingSlotId = parkingSlotId;
			this.parkingDate = parkingDate;
			this.parkingTime = parkingTime;
			this.parkingDuration = parkingDuration;
			this.parkingFloor = parkingFloor;
		}





	/*	public Payment getPayment() {
			return payment;
		}

        public void setPayment(Payment payment) {
			this.payment = payment;
		}
*/




		public int getParkingSlotId() {
			return parkingSlotId;
		}

		public void setParkingSlotId(int parkingSlotId) {
			this.parkingSlotId = parkingSlotId;
		}

		public ParkingFloor getParkingFloor() {
			return parkingFloor;
		}

		public void setParkingFloor(ParkingFloor parkingFloor) {
			this.parkingFloor = parkingFloor;
		}

		public Date getParkingDate() {
			return parkingDate;
		}

		public void setParkingDate(Date parkingDate) {
			this.parkingDate = parkingDate;
		}

		public String getParkingTime() {
			return parkingTime;
		}

		public void setParkingTime(String parkingTime) {
			this.parkingTime = parkingTime;
		}


		public int getParkingDuration() {
			return parkingDuration;
		}

		public void setParkingDuration(int parkingDuration) {
			this.parkingDuration = parkingDuration;
		}

		@Override
		public String toString() {
			return "ParkingSlots [parkingSlotId=" + parkingSlotId + ", parkingDate=" + parkingDate + ", parkingTime="
					+ parkingTime + ", parkingDuration=" + parkingDuration + ", parkingFloor=" + parkingFloor + "]";
		}

		
	
		
		
		
	}

