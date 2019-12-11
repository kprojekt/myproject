package com.sathya.rms.admin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.data.CityRepository;
import com.sathya.rms.admin.data.RestaurantRepository;
import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.entities.Restaurant;
import com.sathya.rms.admin.entities.State;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	RestaurantRepository restaurantRepository;
	
	public Iterable<Restaurant> getAllRestaurant(){
		return restaurantRepository.findAll();
		
	}

	@Transactional
	public Restaurant insertData(Restaurant Restaurant) {
		return restaurantRepository.save(Restaurant);
	}

	@Transactional
	public Restaurant updateRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@Transactional
	public void deleteFromRestaurant(Integer id) {
		restaurantRepository.deleteById(id);
		
	}

	@Override
	public Object getById(Integer id) {
		return restaurantRepository.findById(id);
	}

}


