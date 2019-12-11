package com.sathya.rms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entities.Designation;
import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.services.DesignationService;

@RestController
@RequestMapping(path="/designation")
public class DesignationController {
	
	@Autowired
	DesignationService designationService;
	
	@GetMapping(path="/getAllDesignations")
	public Iterable<Designation> getAllDesignations(){
		return designationService.getAllDesignations();
		
	}
	@PostMapping(path="/addDesignation")
	public Designation insertData(@RequestBody Designation designation) {
		return designationService.insertData(designation);
	}
	
	@PutMapping(path="/updateDesignation")
	public Designation updateDesignation(@RequestBody Designation designation) {
		return designationService.updateDesignation(designation);
	}
	
	@DeleteMapping(path="/deleteFromDesignation/{id}")
	public void deleteFromDesignation(@PathVariable("id") Integer id) {
		designationService.deleteFromDesignation(id);
	}
	
	@GetMapping(path="/getById/{id}")
	public Object getById(@PathVariable("id") Integer id){
		return designationService.getById(id);
	}

}
