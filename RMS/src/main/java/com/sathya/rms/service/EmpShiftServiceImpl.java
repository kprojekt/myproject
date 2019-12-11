package com.sathya.rms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.data.EmpShiftRepository;
import com.sathya.rms.entities.EmpShift;

@Service
public class EmpShiftServiceImpl implements EmpShiftService {
	@Autowired
	EmpShiftRepository empShiftRepository;

	@Override
	public Object getById(Integer id) {
		// TODO Auto-generated method stub
		return empShiftRepository.findById(id);
	}

	@Override
	public Iterable<EmpShift> getAllEmpShift() {
		// TODO Auto-generated method stub
		return empShiftRepository.findAll();
	}

	@Transactional
	public EmpShift insertData(EmpShift empShift) {
		// TODO Auto-generated method stub
		return empShiftRepository.save(empShift);
	}

	@Transactional
	public EmpShift updateEmpShift(EmpShift empShift) {
		// TODO Auto-generated method stub
		return empShiftRepository.save(empShift);
	}

	@Transactional
	public void deleteFromEmpShift(Integer id) {
		empShiftRepository.deleteById(id);
	}

}
