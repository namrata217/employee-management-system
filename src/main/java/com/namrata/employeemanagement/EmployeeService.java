package com.namrata.employeemanagement;
import com.namrata.employeemanagement.repository.EmployeeRepository;
import com.namrata.employeemanagement.validator.EmployeeValidator;
import java.util.ArrayList;
import com.namrata.employeemanagement.model.Employee;

public class EmployeeService {
	private final EmployeeRepository employeeRepository;
	private final EmployeeValidator employeeValidator;
	
	public EmployeeService(EmployeeRepository employeeRepository,
            EmployeeValidator employeeValidator) {
			this.employeeRepository = employeeRepository;
			this.employeeValidator = employeeValidator;
	}
	
	public ArrayList<Employee> getAllEmployees() {
	    return employeeRepository.getAllEmployees();
	}
	
	public boolean registerEmployee(Employee employee) {
	    if (!employeeValidator.isValidName(employee.getName())) {
	        return false;
	    }
	    if (!employeeValidator.isValidEmail(employee.getEmail())) {
	        return false;
	    }
	    if (!employeeValidator.isValidMobile(employee.getMobile())) {
	        return false;
	    }
	    if (!employeeValidator.isValidDepartment(employee.getDepartment())) {
	        return false;
	    }
	    if (!employeeValidator.isValidSalary(employee.getSalary())) {
	        return false;
	    }
	    if (employeeRepository.existsByEmployeeId(employee.getEmployeeId())) {
	        return false;
	    }
	    employeeRepository.saveEmployee(employee);
	    return true;
	}
	
	public Employee findEmployeeById(int employeeId) {
	    return employeeRepository.findEmployeeById(employeeId);
	}

	public boolean deleteEmployeeById(int employeeId) {
		return employeeRepository.deleteEmployeeById(employeeId);
	}
	
	public boolean updateEmployee(Employee employee) {
	    if (!employeeValidator.isValidName(employee.getName())) {
	        return false;
	    }

	    if (!employeeValidator.isValidEmail(employee.getEmail())) {
	        return false;
	    }

	    if (!employeeValidator.isValidMobile(employee.getMobile())) {
	        return false;
	    }

	    if (!employeeValidator.isValidDepartment(employee.getDepartment())) {
	        return false;
	    }

	    if (!employeeValidator.isValidSalary(employee.getSalary())) {
	        return false;
	    }

	    return employeeRepository.updateEmployee(employee);
	}

}
