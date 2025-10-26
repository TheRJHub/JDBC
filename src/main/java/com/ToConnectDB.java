package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ToConnectDB {
	public static void main(String[] args) {
		try {
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5431/college","postgres","kiit");
        Statement stmt=con.createStatement();
        //String query="insert into student values (2,'A',76)";
        String query="select * from student";
//        stmt.execute(query);
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()) {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
        }
        
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
