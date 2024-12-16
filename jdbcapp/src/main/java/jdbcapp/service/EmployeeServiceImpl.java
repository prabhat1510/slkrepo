package jdbcapp.service;

import jdbcapp.dao.EmployeeDAO;
import jdbcapp.dao.EmployeeDAOImpl;
import jdbcapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public Employee addEmployee(Employee employee) {
		EmployeeDAO empDAO = new EmployeeDAOImpl();
		Employee emp = empDAO.addEmployee(employee);
		return emp;
	}

	public Employee getEmployee(Integer empId) {
		EmployeeDAO empDAO = new EmployeeDAOImpl();
		Employee emp = empDAO.getEmployee(empId);
		return emp;
	}

	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
