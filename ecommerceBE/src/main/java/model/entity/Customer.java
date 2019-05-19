package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerDetails")
public class Customer {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="ID")
		private int custId;
		@Column(name="Name")
		private String custName;
		@Column(name="Age")
		private int custAge;
		
		public Customer() {
			
		}
		
		public Customer(String custName, int custAge) {
			super();
			this.custName = custName;
			this.custAge = custAge;
		}
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public int getCustAge() {
			return custAge;
		}
		public void setCustAge(int custAge) {
			this.custAge = custAge;
		}
		
		
		
}
