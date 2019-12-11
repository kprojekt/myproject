package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Designation {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String desigId;
    private String desigName;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesigId() {
		return desigId;
	}
	public void setDesigId(String desigId) {
		this.desigId = desigId;
	}
	public String getDesigName() {
		return desigName;
	}
	public void setDesigName(String desigName) {
		this.desigName = desigName;
	}
	

}
