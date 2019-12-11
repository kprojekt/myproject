package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.entities.Restdining;
import com.sathya.rms.admin.entities.State;

public interface RestDiningService {

	public void deleteFromRestDining(Integer id);

	public Object getById(Integer id);

	public Iterable<Restdining> getAllRestDining();

	public Restdining updateRestdining(Restdining restdining);


	public Restdining insertData(Restdining restdining);

}
