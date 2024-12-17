package jdbcapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbcapp.model.Department;
import jdbcapp.utility.DBConnectionUtil;

public class DepartmentDAOImpl implements DepartmentDAO {

	public Department addDepartment(Department department) {
		String sqlInsert ="insert into department values(?,?);";
		Connection conn = DBConnectionUtil.getDBConnection();
		PreparedStatement pStmt;
		try {
			pStmt = conn.prepareStatement(sqlInsert);
			pStmt.setInt(1, department.getDeptNo());
			pStmt.setString(2, department.getDeptName());
			int row = pStmt.executeUpdate();
			if(row !=0) {
				return department;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Department getDepartment(Integer deptNo) {
		
		Department department = null;
		Connection conn = DBConnectionUtil.getDBConnection();
		
		try {
			PreparedStatement pStmt = conn.prepareStatement("select * from department where deptno=?");
			pStmt.setInt(1, deptNo);
			ResultSet rs = pStmt.executeQuery();
			while(rs.next()) {
				department = new Department();
				department.setDeptNo(rs.getInt("deptno"));
				department.setDeptName(rs.getString(2));
				
			}
			
			pStmt.close();
			rs.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return department; 
	}

	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteDepartment(Integer deptNo) {
		String sqlDelete ="delete from department where deptno=?;";
		Connection conn = DBConnectionUtil.getDBConnection();
		PreparedStatement pStmt;
		try {
			pStmt=conn.prepareStatement(sqlDelete);
			pStmt.setInt(1, deptNo);
			int row = pStmt.executeUpdate(sqlDelete);
			if(row == 1) {
				return "Department will dept number "+deptNo+" deleted successfully";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Unable to department with dept number "+deptNo;
		
	}

}
