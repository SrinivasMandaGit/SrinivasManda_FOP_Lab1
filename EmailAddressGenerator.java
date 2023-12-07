package com.greatlearning.emailapp.services;

import com.greatlearning.emailapp.utils.DepartmentNameGenerator;

public class EmailAddressGenerator {

	
	public String generateEmailAddress(String firstName, String lastName, int departmentCode){

		// Called static method from DepartmentNameGenerator Class to get the departmentName
		String departmentName = DepartmentNameGenerator.getDepartmentName(departmentCode);


		// StringBuilder is instantiated object reference emailAddressBuilder to concatenate the multiple Strings
		StringBuilder emailAddressBuilder = new StringBuilder();
		
		emailAddressBuilder.append(firstName);
		emailAddressBuilder.append(".");
		emailAddressBuilder.append(lastName);
		emailAddressBuilder.append(".@");
		emailAddressBuilder.append(departmentName);
		emailAddressBuilder.append(".gl.com");
		
		String emailAddress = emailAddressBuilder.toString();
		
		return emailAddress;
				
	}
	
}
