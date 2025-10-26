package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class createDatabaseConnection {
public static Connection postgres() {
	Connection con=null;
	try {
        Class.forName("org.postgresql.Driver");
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5431/college","postgres","YourPassword");

		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return con;
}
public static Connection mysql() {
	Connection con=null;
	try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava?user=root && password=YourPassword");

		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return con;
}

}
