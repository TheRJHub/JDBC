package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingPreparedStmt {
public static void main(String[] args) {
	try {
		//1: Load Driver Class
        Class.forName("org.postgresql.Driver");
        //2: get Connection
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5431/college","postgres","YourPassword");
        //Query
        String query="insert into student values (?,?,?)";
        //3:create stmt
        PreparedStatement pstmt = con.prepareStatement(query);
        //set values   
        pstmt.setInt(1, 4);
        pstmt.setString(2, "DKrajat");
        pstmt.setDouble(3, 87.6);
        //4: Execute query
        pstmt.execute();
      //5:close connection
        con.close();
		}
		catch (ClassNotFoundException c){
            System.out.println("Class Not exist");
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
