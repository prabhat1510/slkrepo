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
public class DepartmentController {
	@Autowired
	private DepartmentService service;
	
	@PostMapping("/newdepartment")
	public Department addNewDdepartment(@RequestBody Department department) {
		return service.addNewDepartment(department);
	}
	
	@GetMapping("/department/{id}")
	public Department getDepartmentById(@PathVariable("id") Integer deptId) {
		return service.retrieveDepartment(deptId);
	}

}
