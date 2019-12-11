package com.sathya.rms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sathya.rms.admin.entities.Dining;
import com.sathya.rms.admin.services.DiningService;

@RestController
@RequestMapping(path="/dining")
public class DiningController {
	
	@Autowired
	DiningService diningService;
	
	@GetMapping(path="/getAllDiningDetails")
	public Iterable<Dining> getAllDiningDetails(){
		return diningService.getAllDiningDetails();
    }
	
	@PostMapping(path="/addState")
	public Dining insertData(@RequestBody Dining Dining) {
		return diningService.insertData(Dining);
	}
	
	@PutMapping(path="/updateState")
	public Dining update(@RequestBody Dining Dining) {
		return diningService.updateDining(Dining);
	}
	
	@DeleteMapping(path="/deleteFromState/{id}")
	public void deleteFromDining(@PathVariable("id") Integer id) {
		diningService.deleteFromDining(id);
	}
	
	@GetMapping(path="/getById/{id}")
	public Object getById(@PathVariable("id") Integer id){
		return diningService.getById(id);
	}
}
