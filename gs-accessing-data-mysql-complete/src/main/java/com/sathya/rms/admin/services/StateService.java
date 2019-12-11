package com.sathya.rms.admin.services;

import java.util.Optional;

import com.sathya.rms.admin.entities.State;

public interface StateService {

	public Iterable<State> getAllStates();

	public State insertData(State state);

	public State updateState(State state);

	public void deleteFromState(Integer id);

	public Object getById(Integer id);
	public Optional<State> findByStId(String id);

}