package com.sathya.rms.service;

import com.sathya.rms.entities.EmpShift;


public interface EmpShiftService  {

	public Object getById(Integer id);

	public Iterable<EmpShift> getAllEmpShift();

	public EmpShift insertData(EmpShift empShift);

	public EmpShift updateEmpShift(EmpShift empShift);

	public void deleteFromEmpShift(Integer id);
	

	
	

}
