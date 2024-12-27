package com.training.cafeapp.onetomanybi;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Employee addNewEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public Employee retrieveEmployee(Integer empId) {
		Optional<Employee> emp = repo.findById(empId);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			return null;
		}
	}

}
