package com.sathya.rms.service;

import com.sathya.rms.entities.ShiftType;


public interface ShiftTypeService  {
	
	public Iterable<ShiftType> getAllShiftType();

	public ShiftType insertData(ShiftType shiftType);

	public ShiftType updateShiftType(ShiftType shiftType);

	public void deleteFromShiftType(Integer id);

	public Object getById(Integer id);
	

	
	

}
