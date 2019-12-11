package com.sathya.rms.admin.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.admin.data.StateRepository;
import com.sathya.rms.admin.entities.State;

@Service
public class StateServiceImpl implements StateService {
	@Autowired
	StateRepository stateRepository;
	
	public Iterable<State> getAllStates(){
		return stateRepository.findAll();
	}
	
	@Transactional
	public State insertData(State state) {
		return stateRepository.save(state);
	}

    @Transactional
	public State updateState(State state) {
		// TODO Auto-generated method stub
		return stateRepository.save(state);
	}

    @Transactional
	public void deleteFromState(Integer id) {
		
		stateRepository.deleteById(id);
	}

	@Override
	public Object getById(Integer id) {
		// TODO Auto-generated method stub
		 return stateRepository.findById(id);
	}

	@Override
	public Optional<State> findByStId(String id) {
		// TODO Auto-generated method stub
		return stateRepository.findInRepoByStId(id);
	}


	


	

}
