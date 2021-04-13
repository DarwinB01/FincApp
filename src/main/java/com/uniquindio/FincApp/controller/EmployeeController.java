package com.uniquindio.FincApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@PostMapping("/registrarEmpleado")
	public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping("/eliminarEmpleadoPorCedula/{cedula}")
	public void deleteEmployeeById(@PathVariable Long cedula) {
		employeeService.deleteById(cedula);
	}
	
	@GetMapping("/buscarEmpleadoPorCedula/{cedula}")
	public EmployeeDTO findEmployee(@PathVariable Long cedula) {
		return employeeService.findById(cedula);
	}
	
	@GetMapping("/buscarTodosLosEmpleados")
	public List<EmployeeDTO> findAllEmployee(){
		return employeeService.findAll();
	}
}
