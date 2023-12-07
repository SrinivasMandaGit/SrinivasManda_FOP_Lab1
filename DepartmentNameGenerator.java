package com.greatlearning.emailapp.utils;


// Utility class with static method to get the departmentName.
public class DepartmentNameGenerator {
	
	 public static String getDepartmentName(int departmentCode) {

		 // Declared the departmentName data member to initialize Department Name
		 String departmentName = "";
			
		 
		 // Switch case statement to get the departmentName basis on input from user. 
			switch (departmentCode) {
			case 1:
				
				departmentName = "technical";
				
				break;
				
			case 2:
				
				departmentName = "admin";
				
				break;
				
			case 3:
				
				departmentName = "hr";
				
				break;
				
			case 4:
				
				departmentName = "legal";
				
				break;

			default:
				
				System.out.println("Invalid Departmment Option chosen, please chose a value between 1 and 4");
				
				System.exit(-1);
				
			}
			
			return departmentName;
			
		}

}
