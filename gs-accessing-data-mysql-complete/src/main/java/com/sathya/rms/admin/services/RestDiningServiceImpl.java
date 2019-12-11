package com.sathya.rms.admin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.RestDiningRepository;
import com.sathya.rms.admin.entities.Restdining;

@Service
public class RestDiningServiceImpl implements RestDiningService {

	@Autowired
	RestDiningRepository restDiningRepository;

	@Override
	public void deleteFromRestDining(Integer id) {
		restDiningRepository.deleteById(id);

	}

	@Override
	public Object getById(Integer id) {
		// TODO Auto-generated method stub
		return restDiningRepository.findById(id);
	}

	@Override
	public Iterable<Restdining> getAllRestDining() {
		// TODO Auto-generated method stub
		return restDiningRepository.findAll();
	}

	@Override
	public Restdining updateRestdining(Restdining restdining) {
		// TODO Auto-generated method stub
		return restDiningRepository.save(restdining);
	}

	@Override
	public Restdining insertData(Restdining restdining) {
		// TODO Auto-generated method stub
		return restDiningRepository.save(restdining);
	}

}
