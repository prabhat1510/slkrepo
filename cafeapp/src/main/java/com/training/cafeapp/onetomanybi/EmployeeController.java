package com.training.cafeapp.onetomanybi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/onetomanybi")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/newemployee")
	public Employee addNewEmployee(@RequestBody Employee employee) {
		return service.addNewEmployee(employee);
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer empId) {
		return service.retrieveEmployee(empId);
	}

}
