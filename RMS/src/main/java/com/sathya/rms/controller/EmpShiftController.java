package com.sathya.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.EmpShift;
import com.sathya.rms.service.EmpShiftService;

@RestController
@RequestMapping(path="/empshift")
public class EmpShiftController {
	
	@Autowired
	EmpShiftService empShiftService;
	
	@GetMapping(path="/getAllEmpShift")
	public Iterable<EmpShift> getAllEmpShift(){
		return empShiftService.getAllEmpShift();
	}
	
	@PostMapping(path="/addEmpShift")
	public EmpShift insertData(@RequestBody EmpShift EmpShift) {
		return empShiftService.insertData(EmpShift);
	}
	
	
	@PutMapping(path="/updateEmpShift")
	public EmpShift updateEmpShift(@RequestBody EmpShift EmpShift) {
		return empShiftService.updateEmpShift(EmpShift);
	}
	
	@DeleteMapping(path="/deleteFromEmpShift/{id}")
	public void deleteFromState(@PathVariable("id") Integer id) {
		empShiftService.deleteFromEmpShift(id);
	}
	
	@GetMapping(path="/getById/{id}")
	public Object getById(@PathVariable("id") Integer id){
		return empShiftService.getById(id);
	}
	
	
	

}
