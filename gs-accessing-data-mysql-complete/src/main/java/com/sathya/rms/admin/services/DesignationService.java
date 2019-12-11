package com.sathya.rms.admin.services;

import org.springframework.stereotype.Service;

import com.sathya.rms.admin.entities.Designation;
import com.sathya.rms.admin.entities.State;

@Service
public interface DesignationService {

	public Iterable<Designation> getAllDesignations();

	public Designation insertData(Designation designation);

	public Designation updateDesignation(Designation designation);

	public void deleteFromDesignation(Integer id);

	public Object getById(Integer id);

}
