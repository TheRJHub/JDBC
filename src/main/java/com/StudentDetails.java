package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDetails {
	public static Connection insert() {
		Scanner sc=new Scanner(System.in);
		Connection con = createDatabaseConnection.postgres();
		try {
	        String query="insert into student values (?,?,?)";
	        PreparedStatement pstmt = con.prepareStatement(query);
	        System.out.println("Enter the id: ");
	        pstmt.setInt(1, sc.nextInt());
	        
	        System.out.println("Enter the Name: ");
	        pstmt.setString(2,sc.next());
	        
	        System.out.println("Enter the %: ");
	        pstmt.setDouble(3,sc.nextDouble());

	        pstmt.execute();
	        con.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		return con;
	}
	public static Connection fetchData(){
		Connection con = createDatabaseConnection.postgres();
		try {
	        String query="select * from student";
	        Statement stmt=con.createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while(rs.next()) {
	        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
	        }
	        con.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		return con;
	}
	public static Connection findById(){
		Connection con = createDatabaseConnection.postgres();
		Scanner sc=new Scanner(System.in);
        try {
			PreparedStatement pstmt = con.prepareStatement("select * from student where id=?");
			System.out.println("Enter Student Id to filter: ");
			pstmt.setInt(1,sc.nextInt());
	        ResultSet rs = pstmt.executeQuery();
	        while(rs.next()) {
	        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return con;

	}


}
