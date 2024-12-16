package jdbcapp.service;

import jdbcapp.dao.DepartmentDAO;
import jdbcapp.dao.DepartmentDAOImpl;
import jdbcapp.model.Department;

public class DepartmentServiceImpl implements DepartmentService {

	public Department addDepartment(Department department) {
		DepartmentDAO deptDAO = new DepartmentDAOImpl();
		Department dept = deptDAO.addDepartment(department);
		return dept;
	}

	public Department getDepartment(Integer deptNo) {
		DepartmentDAO deptDAO = new DepartmentDAOImpl();
		Department dept = deptDAO.getDepartment(deptNo);
		return dept;
	}

	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteDepartment(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
