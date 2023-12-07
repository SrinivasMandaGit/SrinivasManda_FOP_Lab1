package com.greatlearning.emailapp.services;

import com.greatlearning.emailapp.model.Employee;


//interface with unimplemented methods.
public interface ICredentialService {

	public String generatePassword();
	
	public String generateEmailAddress(String firstName, String lastName, int departmentCode);
	
	public String displayCredentials(Employee employee);
	
}
