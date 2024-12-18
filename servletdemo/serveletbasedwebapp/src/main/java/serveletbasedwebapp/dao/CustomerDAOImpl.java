package serveletbasedwebapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import serveletbasedwebapp.model.Customer;
import serveletbasedwebapp.utility.DBConnectionUtil;
import serveletbasedwebapp.utility.QueryMapper;

public class CustomerDAOImpl implements CustomerDAO {

	public String addCustomer(Customer customer) {
		Connection conn = DBConnectionUtil.getDBConnection();
		PreparedStatement pStmt;
		try {
			//pStmt = conn.prepareStatement(sqlInsert);
			pStmt = conn.prepareStatement(QueryMapper.INSERT_CUSTOMER);
			pStmt.setInt(1, customer.getCustId());
			pStmt.setString(2, customer.getCustName());
			int row = pStmt.executeUpdate();
			if(row !=0) {
				return "Data inserted successfully";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Customer getCustomerById(Integer custId) {
		Customer customer = null;
		Connection conn = DBConnectionUtil.getDBConnection();
		
		try {
			
			PreparedStatement pStmt = conn.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);
			pStmt.setInt(1, custId);
			ResultSet rs = pStmt.executeQuery();
			while(rs.next()) {
				customer = new Customer();
				customer.setCustId(rs.getInt(1));
				customer.setCustName(rs.getString(2));
				
			}
			
			pStmt.close();
			rs.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}

}
