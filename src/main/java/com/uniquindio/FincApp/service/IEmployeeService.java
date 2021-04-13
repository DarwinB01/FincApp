package com.uniquindio.FincApp.service;

import java.util.List;
import com.uniquindio.FincApp.model.Employee;

public interface IEmployeeService {
	
	public Employee save(Employee employee);
	
	public void deleteById(Long cedula);
	
	public List<Employee> findAll();
	
	public Employee findById(Long cedula);

}
