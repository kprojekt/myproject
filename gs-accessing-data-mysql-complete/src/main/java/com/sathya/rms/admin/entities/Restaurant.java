package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Restaurant {
	
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer id;
	    private String rId;
	    private String phNo;
	    private String email;
	    private String locId;
	    private String cId;
	    private String cName;
	    private String stId;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getrId() {
			return rId;
		}
		public void setrId(String rId) {
			this.rId = rId;
		}
		public String getPhNo() {
			return phNo;
		}
		public void setPhNo(String phNo) {
			this.phNo = phNo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getLocId() {
			return locId;
		}
		public void setLocId(String locId) {
			this.locId = locId;
		}
		public String getcId() {
			return cId;
		}
		public void setcId(String cId) {
			this.cId = cId;
		}
		public String getcName() {
			return cName;
		}
		public void setcName(String cName) {
			this.cName = cName;
		}
		public String getStId() {
			return stId;
		}
		public void setStId(String stId) {
			this.stId = stId;
		}

}
