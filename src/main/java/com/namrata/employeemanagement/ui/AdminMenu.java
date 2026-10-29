
package com.namrata.employeemanagement.ui;

import java.util.Scanner;

import com.namrata.employeemanagement.EmployeeService;

import com.namrata.employeemanagement.model.Employee;

public class AdminMenu {

    private final EmployeeService employeeService;

    public AdminMenu(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    
    Scanner s=new Scanner(System.in);
    public void start() {
        // We will put the menu code here.
    	
    	 boolean running = true;
        while (running) {
        	System.out.println("1. Register Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice : ");
            int choice=s.nextInt();
           
        	switch(choice)
        	{
        		case 1:
        			System.out.println("Enter Employee ID:");
        			int employeeId = s.nextInt();
        			s.nextLine();
        			System.out.println("Enter Employee Name:");
        			String name = s.nextLine();
        			System.out.println("Enter Employee Email:");
        			String email = s.nextLine();
        			System.out.println("Enter Employee Mobile Number:");
        			String mobile = s.nextLine();
        			System.out.println("Enter Employee Department:");
        			String department = s.nextLine();
        			System.out.println("Enter Employee salary:");
        			double salary = s.nextDouble();
        			s.nextLine();
        			Employee employee = new Employee(
        				    employeeId, name, email, mobile, department, salary
        				);

        				boolean registered = employeeService.registerEmployee(employee);

        				if (registered) {
        				    System.out.println("Employee registered successfully!");
        				} else {
        				    System.out.println("Employee registration failed. Check the details or employee ID.");
        				}
        		break;
        		case 2:
        			
        		
        		    for (Employee emp : employeeService.getAllEmployees()) {
        		        System.out.println(
        		            emp.getEmployeeId() + " | " +
        		            emp.getName() + " | " +
        		            emp.getEmail() + " | " +
        		            emp.getMobile() + " | " +
        		            emp.getDepartment() + " | " +
        		            emp.getSalary()
        		        );
        		    }
        		    
        		break;
        		case 3:
        		    System.out.println("Enter Employee ID to search:");
        		    int searchId = s.nextInt();

        		    Employee emp = employeeService.findEmployeeById(searchId);

        		    if (emp != null) {
        		        System.out.println("Employee found: " + emp.getName());
        		        System.out.println("Email: " + emp.getEmail());
        		        System.out.println("Mobile: " + emp.getMobile());
        		        System.out.println("Department: " + emp.getDepartment());
        		        System.out.println("Salary: " + emp.getSalary());
        		    } else {
        		        System.out.println("Employee not found.");
        		    }
        		break;
        		case 4:
        		    System.out.println("Enter Employee ID to delete:");
        		    int deleteId = s.nextInt();

        		    boolean deleted = employeeService.deleteEmployeeById(deleteId);

        		    if (deleted) {
        		        System.out.println("Employee deleted successfully!");
        		    } else {
        		        System.out.println("Employee not found.");
        		    }
        		break;
        		case 5:
        			  System.out.println("Exiting Employee Management System");
        	          running = false;
        	    break;
        		
        		default:
        			System.out.println("enter proper Employee");
        		break;
        	}
        }
        
    }
    
    
}
