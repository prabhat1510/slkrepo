package jdbcapp.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import jdbcapp.model.Department;
import jdbcapp.utility.DBConnectionUtil;
import jdbcapp.utility.QueryMapper;

public class DepartmentDAOImpl implements DepartmentDAO {

	public Department addDepartment(Department department) {
		//String sqlInsert ="insert into department values(?,?);";
		Connection conn = DBConnectionUtil.getDBConnection();
		PreparedStatement pStmt;
		try {
			//pStmt = conn.prepareStatement(sqlInsert);
			pStmt = conn.prepareStatement(QueryMapper.INSERT_DEPARTMENT);
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
			//PreparedStatement pStmt = conn.prepareStatement("select * from department where deptno=?");
			PreparedStatement pStmt = conn.prepareStatement(QueryMapper.GET_DEPARTMENT_BY_ID);
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
		//String sqlDelete ="delete from department where deptno=?;";
		Connection conn = DBConnectionUtil.getDBConnection();
		PreparedStatement pStmt;
		try {
			//pStmt=conn.prepareStatement(sqlDelete);
			pStmt=conn.prepareStatement(QueryMapper.DELETE_DEPARTMENT_BY_ID);
			pStmt.setInt(1, deptNo);
			int row = pStmt.executeUpdate();
			if(row == 1) {
				return "Department will dept number "+deptNo+" deleted successfully";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Unable to department with dept number "+deptNo;
		
	}

	public List<Department> retrieveAllDepartment() {
		//String selectAllSQL ="select * from department;";
		Connection conn = DBConnectionUtil.getDBConnection();
		List<Department> listOfDepartment = new ArrayList<Department>();
		Department department;
		try {
			Statement stmt = conn.createStatement();
			//ResultSet rs = stmt.executeQuery(selectAllSQL);
			ResultSet rs = stmt.executeQuery(QueryMapper.GET_ALL_DEPARTMENT);
			while(rs.next()) {
				department=new Department();
				department.setDeptNo(rs.getInt(1));
				department.setDeptName(rs.getString(2));
				listOfDepartment.add(department);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listOfDepartment;
	}

	public void useOfCallabale() {
		Connection conn = DBConnectionUtil.getDBConnection();
		try {
			CallableStatement cStmt = conn.prepareCall("{call getAllDepartment ()}");
			ResultSet rs = cStmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
