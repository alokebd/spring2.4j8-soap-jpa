package com.vision.tech.soap.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vision.tech.soap.entities.Employee;
import com.vision.tech.soap.repo.EmployeeRepository;
import com.vision.tech.soap.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	 @Autowired
	 EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee getEmployeeById(long employeeId) {
		
		Employee obj = employeeRepository.findByEmployeeId(employeeId);
		return obj;
		
	}

	@Override
	public void AddEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployee(long employeeId) {
		employeeRepository.deleteById(employeeId);

	}
	
}
