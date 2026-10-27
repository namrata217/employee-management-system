
package com.namrata.employeemanagement.model;

public class Employee {

    private int employeeId;
    private String name;
    private String email;
    private String mobile;
    private String department;
    private double salary;

    // Constructor
    public Employee(int employeeId, String name, String email,
                    String mobile, String department, double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.department = department;
        this.salary = salary;
    }
    
    //A getter is a public method that allows another class to read a private field.
    
    public int getEmployeeId() {
        return employeeId;
    }
    
    public String getName() {
    	return name;
    }
    
    public String getEmail() {
    	return email;
    }
    
    public String getMobile() {
    	return mobile;
    }
    public String getDepartment() {
    	return department;
    }
    public double getSalary() {
    	return salary;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public void setEmail(String email) {
    	this.email=email;
    }
    public void setMobile(String mobile) {
    	this.mobile=mobile;
    }
    public void setDepartment(String department) {
    	this.department=department;
    }
    public void setSalary(double salary) {
    	this.salary=salary;
    }
}
