package com.namrata.employeemanagement;
import com.namrata.employeemanagement.repository.EmployeeRepository;
import com.namrata.employeemanagement.validator.EmployeeValidator;
import com.namrata.employeemanagement.EmployeeService;
import com.namrata.employeemanagement.ui.AdminMenu;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRepository  repository=new EmployeeRepository();
		EmployeeValidator validator=new EmployeeValidator();
		EmployeeService service=new EmployeeService(repository, validator);
		
		AdminMenu adminMenu=new AdminMenu(service);
		adminMenu.start();
	}

}
