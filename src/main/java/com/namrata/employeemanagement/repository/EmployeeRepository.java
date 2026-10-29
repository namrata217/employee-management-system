package com.namrata.employeemanagement.repository;
import java.util.ArrayList;
import com.namrata.employeemanagement.model.Employee;
public class EmployeeRepository {
	 private ArrayList<Employee> employees = new ArrayList<>();
	 
	 public void saveEmployee(Employee employee) 
	 {
		    // Add the received object to the employees collection
		 employees.add(employee);
	 }
	 
	 public ArrayList<Employee> getAllEmployees()
	 {
		 return employees;
	 }
	 
	 public Employee findEmployeeById(int employeeId) {
		    // Search logic goes here
		 for (Employee employee : employees) {
			    // comparison goes here
			 if (employee.getEmployeeId() == employeeId) {
				    // return the matching employee here
				 return employee;
				}
			}
		 return null;
	 }
	 
	 public boolean deleteEmployeeById(int employeeId) {
		    Employee employee = findEmployeeById(employeeId);

		    if (employee!=null) {
		        employees.remove(employee);
		        return true;
		    }

		    return false;
		}
	 public boolean existsByEmployeeId(int employeeId) {
		    // Write the logic yourself
		 for (Employee employee : employees) {
			    // comparison goes here
			 if (employee.getEmployeeId() == employeeId) {
				    // return the matching employee here
				 return true;
				}
		
			}
		 return false;
		}
	 
	 public boolean updateEmployee(Employee updatedEmployee) {
		    Employee existingEmployee =
		            findEmployeeById(updatedEmployee.getEmployeeId());

		    if (existingEmployee == null) {
		        return false;
		    }

		    existingEmployee.setName(updatedEmployee.getName());
		    existingEmployee.setEmail(updatedEmployee.getEmail());
		    existingEmployee.setMobile(updatedEmployee.getMobile());
		    existingEmployee.setDepartment(updatedEmployee.getDepartment());
		    existingEmployee.setSalary(updatedEmployee.getSalary());

		    return true;
		}
}
