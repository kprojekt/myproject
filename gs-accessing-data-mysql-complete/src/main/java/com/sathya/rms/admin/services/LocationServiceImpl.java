package com.sathya.rms.admin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.data.LocationRepository;
import com.sathya.rms.admin.entities.Location;

@Service
public class LocationServiceImpl implements LocationService{
	
	@Autowired
	LocationRepository locationRepository;

	@Override
	public Iterable<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}

	@Transactional
	public Location insertData(Location location) {
		// TODO Auto-generated method stub
		return locationRepository.save(location);
	}

	@Transactional
	public Location updateState(Location location) {
		// TODO Auto-generated method stub
		return locationRepository.save(location);
	}

	@Transactional
	public void deleteFromLocation(Integer id) {
		locationRepository.deleteById(id);
		
	}

	@Override
	public Object getById(Integer id) {
		// TODO Auto-generated method stub
		return locationRepository.findById(id);
	}

}
