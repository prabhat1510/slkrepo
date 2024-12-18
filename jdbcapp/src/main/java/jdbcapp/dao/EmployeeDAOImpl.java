package jdbcapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbcapp.model.Employee;
import jdbcapp.utility.DBConnectionUtil;
import jdbcapp.utility.QueryMapper;

public class EmployeeDAOImpl implements EmployeeDAO {

	public Employee addEmployee(Employee employee) {
		Connection conn = DBConnectionUtil.getDBConnection();
		PreparedStatement pStmt;
		try {
			//pStmt = conn.prepareStatement(sqlInsert);
			pStmt = conn.prepareStatement(QueryMapper.INSERT_EMPLOYEE);
			pStmt.setInt(1, employee.getEmpId());
			pStmt.setString(2, employee.getEmpName());
			pStmt.setDate(3, Date.valueOf(employee.getDateOfBirth()));
			pStmt.setDouble(4, employee.getSalary());
			pStmt.setInt(5, employee.getDepartment().getDeptNo());
			
			int row = pStmt.executeUpdate();
			if(row !=0) {
				return employee;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Employee getEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return null;
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
