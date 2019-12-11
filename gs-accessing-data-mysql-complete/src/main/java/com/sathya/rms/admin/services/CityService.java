package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.City;

public interface CityService {

	public Iterable<City> getAllCity();
	// TODO Auto-generated method stub

	public City insertData(City city);

	public City updateState(City city);

	public void deleteFromState(Integer id);

	public Object getById(Integer id);

	public City insertNewCity(City city);

}
