package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.entities.Restaurant;
import com.sathya.rms.admin.entities.State;

public interface RestaurantService {


	public Iterable<Restaurant> getAllRestaurant();

	public Restaurant insertData(Restaurant restaurant);

	public Restaurant updateRestaurant(Restaurant restaurant);

	public void deleteFromRestaurant(Integer id);

	public Object getById(Integer id);

}
