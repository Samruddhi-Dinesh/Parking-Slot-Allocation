package com.example.psap.entity;


	import java.util.Date;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	import javax.persistence.Table;

	@Entity
	@Table(name = "payment")
	public class Payment {
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
        private long paymentId;
		
		//@OneToOne(cascade=CascadeType.ALL)
		//@JoinColumn(name = "paymentid_fk",referencedColumnName = "paymentid_fk")
		@Column
		private String type;
		
		@Column
		private Date paymentDateTime;
		@Column
		private double amountPaid;
		
		@Column
		private String status;
		
		// Constructors, Getter & Setter method
		public Payment() {
			super();
		}

		public Payment(long paymentId, String type, Date paymentDateTime, double amountPaid, String status) {
			super();
			this.paymentId = paymentId;
			this.type = type;
			this.paymentDateTime = paymentDateTime;
			this.amountPaid = amountPaid;
			this.status = status;
		}

		public long getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(long paymentId) {
			this.paymentId = paymentId;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Date getPaymentDateTime() {
			return paymentDateTime;
		}

		public void setPaymentDateTime(Date paymentDateTime) {
			this.paymentDateTime = paymentDateTime;
		}

		public double getAmountPaid() {
			return amountPaid;
		}

		public void setAmountPaid(double amountPaid) {
			this.amountPaid = amountPaid;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Payment [paymentId=" + paymentId + ", type=" + type + ", paymentDateTime=" + paymentDateTime
					+ ", amountPaid=" + amountPaid + ", status=" + status + "]";
		}
		
		
		
	}
