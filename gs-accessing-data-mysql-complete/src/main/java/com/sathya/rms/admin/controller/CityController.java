package com.sathya.rms.admin.controller;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.services.CityService;
import com.sathya.rms.admin.services.StateService;

@RestController
@RequestMapping(path="/city")
public class CityController {
	private static final Logger logger = LogManager.getLogger(StateController.class);
	
	@Autowired
	CityService cityService;
	
	@Autowired
	StateService stateService;
	
	@GetMapping(path="/getAllCity")
	public Iterable<City> getAllCity(){
		logger.info("get all city method execution started");
		Iterable<City> result=null;
		try {
			result=cityService.getAllCity();
			logger.debug("result is {0}"+result);
		}
		catch(Exception e) {
			logger.error("errors happen and error is {0}"+e);
		}
		logger.info("get all city method execution completed");
		return result;
	}
	
	@PostMapping(path="/addCity")
	public City insertData(@RequestBody City city) {
		return cityService.insertData(city);
	}
	
	
	@PutMapping(path="/updateCity")
	public City updateState(@RequestBody City city) {
		return cityService.updateState(city);
	}
	
	@DeleteMapping(path="/deleteFromCity/{id}")
	public void deleteFromState(@PathVariable("id") Integer id) {
		cityService.deleteFromState(id);
	}
	
	@GetMapping(path="/getById/{id}")
	public Object getById(@PathVariable("id") Integer id){
		return cityService.getById(id);
	}
	
	@PostMapping(path="/addNewCity")
	public City insertNewCity(@RequestBody City city) {
		Optional<State> state =stateService.findByStId(city.getStId());
		city.setState(state.get());
		
		return cityService.insertNewCity(city);
	}
	
	

}
