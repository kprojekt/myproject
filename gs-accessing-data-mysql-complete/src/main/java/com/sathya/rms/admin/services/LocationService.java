package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Location;

public interface LocationService {

	public Iterable<Location> getAllLocations();

	public Location insertData(Location location);

	public Location updateState(Location location);

	public void deleteFromLocation(Integer id);

	public Object getById(Integer id);

}
