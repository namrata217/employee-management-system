package com.namrata.employeemanagement.validator;

public class EmployeeValidator {
	public boolean isValidName(String name) {
	    // Write your condition here
		if(name == null || name.isBlank())
		{
			System.out.println("Enter Proper name.");
			return false;
		}
		else
		{
			return true;
		}
		
	}

	public boolean isValidEmail(String email) {
		if (email == null || email.isBlank()) {
			return false;
		}

		return email.matches(
        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
		);
	}
	
	public boolean isValidMobile(String mobile) {
	    // Write your validation logic
		if (mobile == null || mobile.isBlank()) {
			return false;
		}

		return mobile.matches(
        "[6-9][0-9]{9}"
		);
	}

	public boolean isValidDepartment(String department) {
		if(department == null || department.isBlank())
		{
			System.out.println("Enter Proper department.");
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean isValidSalary(double salary) {
		if(salary==0 || salary<0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
