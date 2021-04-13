package com.uniquindio.FincApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniquindio.FincApp.dao.IEmployeeDao;
import com.uniquindio.FincApp.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao employeeDao;
	
	@Override
	public Employee save(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public void deleteById(Long cedula) {
		employeeDao.deleteById(cedula);
	}

	@Override
	public List<Employee> findAll() {
		return (List<Employee>) employeeDao.findAll();
	}

	@Override
	public Employee findById(Long cedula) {
		return employeeDao.findById(cedula).orElse(null);
	}

}
