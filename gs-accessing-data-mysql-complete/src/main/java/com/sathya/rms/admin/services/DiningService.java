package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Dining;

public interface DiningService {

	public Iterable<Dining> getAllDiningDetails();

	public Dining insertData(Dining dining);

	public Dining updateDining(Dining dining);

	public void deleteFromDining(Integer id);

	public Object getById(Integer id);

}
