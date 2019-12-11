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

import com.sathya.rms.entities.ShiftType;
import com.sathya.rms.service.ShiftTypeService;

@RestController
@RequestMapping(path="/shifttype")
public class ShiftTypeController {
	
	@Autowired
	ShiftTypeService shiftTypeService;
	
	@GetMapping(path="/getAllShiftType")
	public Iterable<ShiftType> getAllShiftType(){
		return shiftTypeService.getAllShiftType();
	}
	
	@PostMapping(path="/addShiftType")
	public ShiftType insertData(@RequestBody ShiftType ShiftType) {
		return shiftTypeService.insertData(ShiftType);
	}
	
	
	@PutMapping(path="/updateShiftType")
	public ShiftType updateShiftType(@RequestBody ShiftType shiftType) {
		return shiftTypeService.updateShiftType(shiftType);
	}
	
	@DeleteMapping(path="/deleteFromShiftType/{id}")
	public void deleteFromShiftType(@PathVariable("id") Integer id) {
		shiftTypeService.deleteFromShiftType(id);
	}
	
	@GetMapping(path="/getById/{id}")
	public Object getById(@PathVariable("id") Integer id){
		return shiftTypeService.getById(id);
	}
	
	
	

}
