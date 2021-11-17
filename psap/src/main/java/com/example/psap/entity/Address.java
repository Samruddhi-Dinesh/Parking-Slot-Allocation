package com.example.psap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "Address")
	public class Address {
		// should be auto-generated
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "address_Id")
		private int addressId;
		@Column
		private String city;
		@Column
		private String state;
		@Column
		private String pin;
		
		// Constructors, Getter & Setter method
		
		public Address() {
			super();
		}
		
		public Address(int addressId, String city, String state, String pin) {
			super();
			this.addressId = addressId;
			this.city = city;
			this.state = state;
			this.pin = pin;
		}

		public int getAddressId() {
			return addressId;
		}

		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPin() {
			return pin;
		}

		public void setPin(String pin) {
			this.pin = pin;
		}

		@Override
		public String toString() {
			return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
		}
		
		
		
		
	}


