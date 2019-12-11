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
import com.sathya.rms.admin.entities.Location;
import com.sathya.rms.admin.services.LocationService;

@RestController
@RequestMapping(path="/locations")
public class LocationController {
	@Autowired
	LocationService locationService;
	
	@GetMapping(path="/getAllLocations")
	public Iterable<Location> getAllLocations(){
		return locationService.getAllLocations();
	}
	
	@PostMapping(path="/addLocation")
	public Location insertData(@RequestBody Location location) {
		return locationService.insertData(location);
	}
	
	
	@PutMapping(path="/updateLocation")
	public Location updateState(@RequestBody Location location) {
		return locationService.updateState(location);
	}
	
	@DeleteMapping(path="/deleteFromLocation/{id}")
	public void deleteFromState(@PathVariable("id") Integer id) {
		locationService.deleteFromLocation(id);
	}
	
	@GetMapping(path="/getById/{id}")
	public Object getById(@PathVariable("id") Integer id){
		return locationService.getById(id);
	}
	
	

}
