package serveletbasedwebapp.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionUtil {

	// Static method which returns object of Connection type
	public static Connection getDBConnection() {
		Connection conn = null;

		try {
			String url = "jdbc:mysql:// localhost:3306/trainingdb";
			Class.forName("com.mysql.jdbc.Driver"); 
			// Create DB Connection Object
			conn = DriverManager.getConnection(url,"root" ,"password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return conn;
	}

}

