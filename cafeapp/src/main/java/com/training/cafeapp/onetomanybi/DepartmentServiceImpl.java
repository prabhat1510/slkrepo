package com.training.cafeapp.onetomanybi;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository repo;
	
	@Override
	public Department addNewDepartment(Department department) {
		return repo.save(department);
	}

	@Override
	public Department retrieveDepartment(Integer deptNo) {
		Optional<Department> dept = repo.findById(deptNo);
		if(dept.isPresent()) {
			return dept.get();
		}else {
			return null;
		}
	}

}
