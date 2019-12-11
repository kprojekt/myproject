package com.sathya.rms.service;

import com.sathya.rms.entities.Employee;

public interface EmployeeService {

	public Iterable<Employee> getAllEmployee();

	public Employee insertData(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteFromEmployee(Integer id);

	public Object getById(Integer id);

}
