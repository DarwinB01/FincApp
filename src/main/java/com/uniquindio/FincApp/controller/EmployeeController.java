package com.uniquindio.FincApp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniquindio.FincApp.dto.EmployeeDTO;
import com.uniquindio.FincApp.model.Employee;
import com.uniquindio.FincApp.service.IEmployeeService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@PostMapping("/trabajadores")
	public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employee) {
		employee.setCreateAt(new Date());
		return employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping("/trabajadores/{cedula}")
	public void deleteEmployeeById(@PathVariable Long cedula) {
		employeeService.deleteById(cedula);
	}
	
	@GetMapping("/trabajadores/{cedula}")
	public EmployeeDTO findEmployee(@PathVariable Long cedula) {
		return employeeService.findById(cedula);
	}
	
	@GetMapping("/trabajadores")
	public List<EmployeeDTO> findAllEmployee(){
		return employeeService.findAll();
	}
}
