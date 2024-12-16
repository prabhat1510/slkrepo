package jdbcapp.dao;

import jdbcapp.model.Employee;

public interface EmployeeDAO {
	
	//Create
	public Employee addEmployee(Employee employee);
	//Retrieve
	public Employee getEmployee(Integer empId);
	//Update
	public Employee updateEmployee(Employee employee);
	//Delete
	public String deleteEmployee(Integer empId);

}
