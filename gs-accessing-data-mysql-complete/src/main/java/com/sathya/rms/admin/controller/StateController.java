package com.sathya.rms.admin.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.services.StateService;

@RestController 
@RequestMapping(path="/states")
public class StateController {
	private static final Logger logger = LogManager.getLogger(StateController.class);
	@Autowired
	StateService stateService;
	
	@GetMapping(path="/getAllStates")
	public Iterable<State> getAllStates(){
		logger.info("get All states method execution started");
		
		Iterable<State> result=null;
		try {
			result=stateService.getAllStates();
			logger.debug("result is {0}"+result);
		}
		catch(Exception e) {
			logger.error("exception happens and exception info is {0}"+e);
		}
		logger.info("get All states method execution completed");
		
		return result;
	}
	@PostMapping(path="/addState")
	public State insertData(@RequestBody State state) {
		logger.info("inserting data method execution started");
		State result=null;
		try {
			result=stateService.insertData(state);
			logger.debug("result is {0}"+result);
		}
		catch(Exception e) {
			logger.error("exception happens and exception info is {0}"+e);
		}
		logger.info("inserting data method execution completed");
		return result;
	}
	
	@PutMapping(path="/updateState")
	public State updateState(@RequestBody State state) {
		logger.info("inserting data method execution started");
		State result=null;
		try {
			result=stateService.updateState(state);
			logger.debug("result is {0}"+result);
		}
		catch(Exception e) {
			logger.error("exception happens and exception info is {0}"+e);
		}
		logger.info("inserting data method execution completed");
		return result;
	}
	
	@DeleteMapping(path="/deleteFromState/{id}")
	public void deleteFromState(@PathVariable("id") Integer id) {
//		logger.info("inserting data method execution started");
//		
//		try {
//			stateService.deleteFromState(id);
//			logger.debug("result is {0}");
//		}
//		catch(Exception e) {
//			logger.error("exception happens and exception info is {0}"+e);
//		}
//		logger.info("inserting data method execution completed");
		
		
		stateService.deleteFromState(id);
	}
	
	@GetMapping(path="/getById/{id}")
	public Object getById(@PathVariable("id") Integer id){
		return stateService.getById(id);
	}

}
