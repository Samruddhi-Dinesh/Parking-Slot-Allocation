package com.example.psap.entity;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.EnumType;
	import javax.persistence.Enumerated;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Entity
	@Data
	@AllArgsConstructor
	@NoArgsConstructor

	public class Vehicle {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int vehicleId;
		@Column
		@Enumerated(EnumType.STRING)
		private VehicleType vehicleType;
		@Column
		private  String vehicleNumber;
		@Column
		private String vehicleCompany;
		@Column
		private String vehicleModel;
	
	
		
		public int getVehicleId() {
			return vehicleId;
		}
		public void setVehicleId(int vehicleId) {
			this.vehicleId = vehicleId;
		}
	
		public VehicleType getVehicleType() {
			return vehicleType;
		}
		public Vehicle() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Vehicle(int vehicleId, VehicleType vehicleType, String vehicleCompany, String vehicleModel) {
			super();
			this.vehicleId = vehicleId;
			this.vehicleType = vehicleType;
			this.vehicleCompany = vehicleCompany;
			this.vehicleModel = vehicleModel;
		}
		public void setVehicleType(VehicleType vehicleType) {
			this.vehicleType = vehicleType;
		}
		@Override
		public String toString() {
			return "Vehicle [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", vehicleCompany="
					+ vehicleCompany + ", vehicleModel=" + vehicleModel + "]";
		}
		public  String getVehicleNumber() {
			return vehicleNumber;
		}
		public void setVehicleNumber(String vehicleNumber) {
			this.vehicleNumber = vehicleNumber;
		}
		public String getVehicleCompany() {
			return vehicleCompany;
		}
		public void setVehicleCompany(String vehicleCompany) {
			this.vehicleCompany = vehicleCompany;
		}
		public String getVehicleModel() {
			return vehicleModel;
		}
		public void setVehicleModel(String vehicleModel) {
			this.vehicleModel = vehicleModel;
		}
	
		
		
		
		
	}

