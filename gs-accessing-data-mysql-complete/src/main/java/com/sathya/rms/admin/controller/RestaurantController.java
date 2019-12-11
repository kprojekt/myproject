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
import com.sathya.rms.admin.entities.Restaurant;
import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.services.CityService;
import com.sathya.rms.admin.services.RestaurantService;

@RestController
@RequestMapping(path="/restaurant")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@GetMapping(path="/getAllRestaurant")
	public Iterable<Restaurant> getAllRestaurant(){
		return restaurantService.getAllRestaurant();
	}
	
	@PostMapping(path="/addRestaurant")
	public Restaurant insertData(@RequestBody Restaurant Restaurant) {
		return restaurantService.insertData(Restaurant);
	}
	
	
	@PutMapping(path="/updateRestaurant")
	public Restaurant updateState(@RequestBody Restaurant Restaurant) {
		return restaurantService.updateRestaurant(Restaurant);
	}
	
	@DeleteMapping(path="/deleteFromRestaurant/{id}")
	public void deleteFromRestaurant(@PathVariable("id") Integer id) {
		restaurantService.deleteFromRestaurant(id);
	}
	
	@GetMapping(path="/getById/{id}")
	public Object getById(@PathVariable("id") Integer id){
		return restaurantService.getById(id);
	}

}
