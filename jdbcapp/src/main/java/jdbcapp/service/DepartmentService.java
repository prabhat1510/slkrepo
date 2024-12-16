package jdbcapp.service;

import jdbcapp.model.Department;

public interface DepartmentService {
	
	//Create
	public Department addDepartment(Department department);
	//Retrieve
	public Department getDepartment(Integer empId);
	//Update
	public Department updateDepartment(Department department);
	//Delete
	public String deleteDepartment(Integer empId);

}
