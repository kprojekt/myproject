package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
	
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer id;
	    private String locId;
	    private String locName;

	    private String cId;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getLocId() {
			return locId;
		}

		public void setLocId(String locId) {
			this.locId = locId;
		}

		public String getLocName() {
			return locName;
		}

		public void setLocName(String locName) {
			this.locName = locName;
		}

		public String getcId() {
			return cId;
		}

		public void setcId(String cId) {
			this.cId = cId;
		}

}
