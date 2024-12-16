package jdbcapp.service;

import jdbcapp.model.Department;

public interface DepartmentService {
	
	//Create
	public Department addDepartment(Department department);
	//Retrieve
	public Department getDepartment(Integer deptNo);
	//Update
	public Department updateDepartment(Department department);
	//Delete
	public String deleteDepartment(Integer deptNo);

}
