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

import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.entities.Restdining;
import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.services.CityService;
import com.sathya.rms.admin.services.RestDiningService;

@RestController
@RequestMapping(path="/restdining")
public class RestDiningController {
	
	@Autowired
	RestDiningService restDiningService;
	
	@GetMapping(path="/getAllRestDining")
	public Iterable<Restdining> getAllRestDining(){
		return restDiningService.getAllRestDining();
	}
	
	@PostMapping(path="/addRestdining")
	public Restdining insertData(@RequestBody Restdining restdining) {
		return restDiningService.insertData(restdining);
	}
	
	
	@PutMapping(path="/updateRestdining")
	public Restdining updateRestdining(@RequestBody Restdining Restdining) {
		return restDiningService.updateRestdining(Restdining);
	}
	
	@DeleteMapping(path="/deleteFromCity/{id}")
	public void deleteFromRestdining(@PathVariable("id") Integer id) {
		restDiningService.deleteFromRestDining(id);
	}
	
	@GetMapping(path="/getById/{id}")
	public Object getById(@PathVariable("id") Integer id){
		return restDiningService.getById(id);
	}
	
	
	

}
