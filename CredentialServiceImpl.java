package com.greatlearning.emailapp.services;

import com.greatlearning.emailapp.model.Employee;

//CredentialServiceImpl class implementing ICredentialService
public class CredentialServiceImpl implements ICredentialService {

	@Override
	public String generatePassword() {
		// Instantiated object passwordgeneratorobject and called its method and initialized to password data member.
		
		PasswordGenerator passwordgeneratorobject = new PasswordGenerator();
		
		String password = passwordgeneratorobject.generatePassword();
		
		return password;
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, int departmentCode) {
		// Instantiated the object emailaddressgeneratorobject and used its method to generate the emailAddress. 
		
		EmailAddressGenerator emailaddressgeneratorobject = new EmailAddressGenerator();
		
		String emailAddress = emailaddressgeneratorobject.generateEmailAddress(firstName, lastName, departmentCode);
		
		return emailAddress;
	}

	@Override
	public String displayCredentials(Employee employee) {
		// Using StringBuilder and employee object initialized the showCredentials data member to get the desired String output.
		
		String newline = System.lineSeparator();
		
		StringBuilder showcredentialBuilder = new StringBuilder();
		
		showcredentialBuilder.append("Dear ");
		showcredentialBuilder.append(employee.getFirstName());
		showcredentialBuilder.append(", your generated credentials are as follows");
		showcredentialBuilder.append(newline);
		showcredentialBuilder.append("Email    ---> ");
		showcredentialBuilder.append(employee.getEmailAddress());
		showcredentialBuilder.append(newline);
		showcredentialBuilder.append("Password ---> ");
		showcredentialBuilder.append(employee.getPassword());
		
		String showCredentials = showcredentialBuilder.toString();
		
		return showCredentials;
	}



}
