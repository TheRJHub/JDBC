package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//Here taking input from user
public class PreparedStmtUsingScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Connection con = createDatabaseConnection.postgres();
			//1: Load Driver Class
//	        Class.forName("org.postgresql.Driver");
	        //2: get Connection
//	        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5431/college","postgres","YourPassword");
	        //Query
	        String query="insert into student values (?,?,?)";
	        //3:create stmt
	        PreparedStatement pstmt = con.prepareStatement(query);
	  //set values   
	        System.out.println("Enter the id: ");
	        int a=sc.nextInt();
	        pstmt.setInt(1, a);
	        
	        sc.nextLine();
	        System.out.println("Enter the Name: ");
	        String s=sc.nextLine();
	        pstmt.setString(2, s);
	        
	        System.out.println("Enter the %: ");
	        double d=sc.nextDouble();
	        pstmt.setDouble(3, d);

	        //4: Execute query
	        pstmt.execute();
	      //5:close connection
	        con.close();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
