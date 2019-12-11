package com.sathya.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Employee;
import com.sathya.rms.service.EmployeeService;
import com.sathya.rms.service.EmployeeServiceImpl;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeService;
	
	@GetMapping(path="/getAllEmployee")
	public Iterable<com.sathya.rms.entities.Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@PostMapping(path="/addEmployee")
	public Employee insertData(@RequestBody Employee employee) {
		return employeeService.insertData(employee);
	}
	
	@PutMapping(path="/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping(path="/deleteFromEmployee/{id}")
	public void deleteFromEmployee(@PathVariable("id") Integer id) {
		employeeService.deleteFromEmployee(id);
	}
	
	@GetMapping(path="/getById/{id}")
	public Object getById(@PathVariable("id") Integer id){
		return employeeService.getById(id);
	}
	
}
