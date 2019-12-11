package com.sathya.rms.admin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.data.CityRepository;
import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.entities.State;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	CityRepository cityRepository;
	
	public Iterable<City> getAllCity(){
		return cityRepository.findAll();
		
	}

	@Transactional
	public City insertData(City city) {
		// TODO Auto-generated method stub
		return cityRepository.save(city);
	}

	@Transactional
	public City updateState(City city) {
		// TODO Auto-generated method stub
		return cityRepository.save(city);
	}

	@Transactional
	public void deleteFromState(Integer id) {
		cityRepository.deleteById(id);
		
	}

	@Override
	public Object getById(Integer id) {
		// TODO Auto-generated method stub
		return cityRepository.findById(id);
	}

	@Override
	public City insertNewCity(City city) {
		// TODO Auto-generated method stub
		return cityRepository.save(city);
	}

}
