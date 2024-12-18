package jdbcapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import jdbcapp.model.Department;
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
		Employee employee = null;
		Connection conn = DBConnectionUtil.getDBConnection();
		
		try {
			//PreparedStatement pStmt = conn.prepareStatement("select * from department where deptno=?");
			PreparedStatement pStmt = conn.prepareStatement(QueryMapper.GET_EMPLOYEE_BY_ID);
			pStmt.setInt(1, empId);
			ResultSet rs = pStmt.executeQuery();
			while(rs.next()) {
				employee = new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				//TODO
				employee.setSalary(rs.getDouble("salary"));
				employee.setDateOfBirth(rs.getDate(3).toLocalDate());
				
				employee.setDepartment(new Department(rs.getInt(5),null));
				
			}
			
			pStmt.close();
			rs.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee; 
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
