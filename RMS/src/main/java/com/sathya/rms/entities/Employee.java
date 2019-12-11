package com.sathya.rms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee_rms")
public class Employee {
	
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name= "employee_id")
	    private Integer id;
	    @Column(name= "e_id")
	    private String eId;
	    @Column(name= "ename")
	    private String eName;
	    @Column(name= "desig_id")
	    private String desigId;
	    @Column(name= "phno")
	    private String phNo;
	    @Column(name= "salary")
	    private Double Salary;
	    @Column(name= "r_id")
	    private String rId;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String geteId() {
			return eId;
		}
		public void seteId(String eId) {
			this.eId = eId;
		}
		public String geteName() {
			return eName;
		}
		public void seteName(String eName) {
			this.eName = eName;
		}
		public String getDesigId() {
			return desigId;
		}
		public void setDesigId(String desigId) {
			this.desigId = desigId;
		}
		public String getPhNo() {
			return phNo;
		}
		public void setPhNo(String phNo) {
			this.phNo = phNo;
		}
		public Double getSalary() {
			return Salary;
		}
		public void setSalary(Double salary) {
			Salary = salary;
		}
		public String getrId() {
			return rId;
		}
		public void setrId(String rId) {
			this.rId = rId;
		}

		
	   

}
