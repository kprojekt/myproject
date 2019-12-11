package com.sathya.rms.admin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.data.DesignationRepository;
import com.sathya.rms.admin.entities.Designation;
import com.sathya.rms.admin.entities.State;

@Service
public class DesignationServiceImpl implements DesignationService {
	
	@Autowired
	DesignationRepository designationRepository;

	public Iterable<Designation> getAllDesignations() {
		// TODO Auto-generated method stub
		return designationRepository.findAll();
	}

	@Transactional
	public Designation insertData(Designation designation) {
		return designationRepository.save(designation);
	}

	@Transactional
	public Designation updateDesignation(Designation designation) {
		return designationRepository.save(designation);
	}

	@Transactional
	public void deleteFromDesignation(Integer id) {
		 designationRepository.deleteById(id);
		
	}

	@Override
	public Object getById(Integer id) {
		// TODO Auto-generated method stub
		return designationRepository.findById(id);
	}

}
