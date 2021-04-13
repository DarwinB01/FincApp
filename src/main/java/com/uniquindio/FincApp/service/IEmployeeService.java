package com.uniquindio.FincApp.service;

import java.util.List;

import com.uniquindio.FincApp.dto.EmployeeDTO;
import com.uniquindio.FincApp.model.Employee;

public interface IEmployeeService {
	
	public void deleteById(Long cedula);
	
	public List<EmployeeDTO> findAll();
	
	public EmployeeDTO findById(Long cedula);

	public EmployeeDTO saveEmployee(EmployeeDTO employee);

}
