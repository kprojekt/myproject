package com.sathya.rms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="empshift_rms")
public class EmpShift {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name= "empshift_id")
	    private Integer id;
	    @Column(name= "c_id")
	    private String cId;
	    @Column(name= "cname")
	    private String cName;

	    private String stId;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
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
