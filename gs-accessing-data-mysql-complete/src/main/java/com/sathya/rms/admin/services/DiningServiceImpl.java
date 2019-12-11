package com.sathya.rms.admin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.data.DiningRepository;
import com.sathya.rms.admin.entities.Dining;

@Service
public class DiningServiceImpl implements DiningService {
	
	@Autowired
	DiningRepository diningRepository;

	@Override
	public Iterable<Dining> getAllDiningDetails() {
		// TODO Auto-generated method stub
		return diningRepository.findAll();
	}

	@Transactional
	public Dining insertData(Dining dining) {
		// TODO Auto-generated method stub
		return diningRepository.save(dining);
	}

	@Transactional
	public Dining updateDining(Dining dining) {
		// TODO Auto-generated method stub
		return diningRepository.save(dining);
	}

	@Transactional
	public void deleteFromDining(Integer id) {
		diningRepository.deleteById(id);		
	}

	@Override
	public Object getById(Integer id) {
		// TODO Auto-generated method stub
		return diningRepository.findById(id);
	}

}
