package com.sathya.rms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shifttype_rms")
public class ShiftType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "shift_id")
	private Integer id;
	@Column(name= "shiftType")
	private String sType;
	@Column(name= "start")
	private Integer start;
	@Column(name= "end")
	private Integer end;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getsType() {
		return sType;
	}
	public void setsType(String sType) {
		this.sType = sType;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	

}
