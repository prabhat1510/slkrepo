package jdbcapp.utility;

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
			// Create Properties class object. Properties class is present in java.util
			// package
			Properties properties = new Properties();
			// File object for properties file
			File file = new File("src/main/resources/application.properties");
			FileInputStream fis = new FileInputStream(file);
			// load all properties of the application.properties file
			properties.load(fis);

			// Create DB URL using properties
			String url = "jdbc:" + properties.getProperty("db") + "://" + properties.getProperty("dbhostname") + ":"
					+ properties.getProperty("dbport") + "/" + properties.getProperty("dbname");

			// Create DB Connection Object
			conn = DriverManager.getConnection(url, properties.getProperty("username"),
					properties.getProperty("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}

