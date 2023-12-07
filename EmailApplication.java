package com.greatlearning.emailapp.emailapplication;

import java.util.Scanner;

import com.greatlearning.emailapp.model.Employee;
import com.greatlearning.emailapp.services.CredentialServiceImpl;

public class EmailApplication {
	
	
	public static void main(String[] args) {
		
		//Scanner Class to read and store the user inputs.
		Scanner userInputs = new Scanner(System.in);

		//Line separator
		String newline = System.lineSeparator();
		
		// Reading user Inputs.
		System.out.println("**Welcome to the Email Application**");
		
		System.out.println(newline);
		
		System.out.println("Please enter your First Name.");
		String firstName = userInputs.nextLine();
		
		System.out.println("Please enter your Last Name.");
		String lastName = userInputs.nextLine();
		
		System.out.println(newline);
		
		System.out.println("Please enter your department ID from the following. ");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		int departmentCode = userInputs.nextInt();
		
		
		// Instantiated the employee object with parameterized constructor.
		Employee employee = new Employee(firstName, lastName);
		
		
		// Instantiated the showcredentialsobject object.
		CredentialServiceImpl showcredentialsobject = new CredentialServiceImpl();
		
		// initializing the values to the employee object emailAddress and password private data members using showcredentialsobject methods.
		employee.setEmailAddress(showcredentialsobject.generateEmailAddress(firstName, lastName, departmentCode));
		employee.setPassword(showcredentialsobject.generatePassword());
		
		// Initializing the showcredentials data member value using showcredentialsobject object method.
		String showcredentials = showcredentialsobject.displayCredentials(employee);
		
		// Printing the showcredentials data member to display the generated user credentials.
		System.out.println(showcredentials);
		
		
		//Closing the scanner object
		userInputs.close();
		
	}
	
}
