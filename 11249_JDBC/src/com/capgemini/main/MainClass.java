package com.capgemini.main;

//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		OperationClass object = new OperationClass();
		do {
		System.out.println("Enter 1 for insert record: ");
		System.out.println("Enter 2 for delete record: ");
		System.out.println("Enter 3 for update record: ");
		System.out.println("Enter 4 for display_One record: ");
		System.out.println("Enter 5 for display_All record: ");
		Scanner sc = new Scanner(System.in);
		int reply = sc.nextInt();
		switch(reply) {
		case 1:
			object.insert_record();
			break;
		case 2:
			object.update();			
			break;
		case 3:
			object.delete();
			break;
		case 4:
			object.display_one();
			break;
		case 5:
			object.display_All();
			break;
			default:
				System.out.println("Invalid Input");
		}}
	while(true);
		
		
		
	}

}
