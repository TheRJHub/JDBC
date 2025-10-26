package com; 
import java.sql.Connection;
import java.util.Scanner;

public class Driver {
private static final int case1 = 0;

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Enter ur Choice(1.insert 2.fetchData 3.findById 4.toExit): ");
		int c=sc.nextInt();
		switch(c){
		case 1:{
			Connection con=StudentDetails.insert();
			break;
		}
		case 2:{
			Connection con=StudentDetails.fetchData();
			break;
		}	
		case 3:{
			Connection con=StudentDetails.findById();
			break;
			
		}
		case 4:{
			return;
		}
		}
	}
}
}
