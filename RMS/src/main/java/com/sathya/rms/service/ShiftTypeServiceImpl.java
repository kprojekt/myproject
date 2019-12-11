package com.sathya.rms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.ShiftTypeRepository;
import com.sathya.rms.entities.ShiftType;

@Service
public class ShiftTypeServiceImpl implements ShiftTypeService {

	@Autowired
	ShiftTypeRepository shiftTypeRepository;

	@Override
	public Iterable<ShiftType> getAllShiftType() {
		// TODO Auto-generated method stub
		return shiftTypeRepository.findAll();
	}

	@Override
	public ShiftType insertData(ShiftType shiftType) {
		// TODO Auto-generated method stub
		return shiftTypeRepository.save(shiftType);
	}

	@Override
	public ShiftType updateShiftType(ShiftType shiftType) {
		return shiftTypeRepository.save(shiftType);
	}

	@Override
	public void deleteFromShiftType(Integer id) {
		shiftTypeRepository.deleteById(id);

	}

	@Override
	public Object getById(Integer id) {
		// TODO Auto-generated method stub
		return shiftTypeRepository.findById(id);
	}

}
