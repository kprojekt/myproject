package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class City {
	
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer id;
	    private String cId;
	    private String cName;

	    private String stId;
	    
	    @ManyToOne
	    @JoinColumn(name="st_fId")
	    private State state;

		public State getState() {
			return state;
		}

		public void setState(State state) {
			this.state = state;
		}

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
