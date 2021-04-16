package com.sp.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sp.tech.model.Department;
import com.sp.tech.model.Employee;
import com.sp.tech.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Transactional
	public void saveEmployee() {
		Department d1 = new Department("HR");
		Department d2 = new Department("Marketing");
		
		Employee e1 = new Employee("John",23,"publicrelation");
		Employee e2 = new Employee("Willian",24,"negotation");
		
		Employee e3 = new Employee("Thomase",23,"statistics");
		Employee e4 = new Employee("Thomase",23,"data analysis");
		
		e1.setDepartment(d1);
		e2.setDepartment(d1);
		
		e3.setDepartment(d2);
		e4.setDepartment(d2);
		
		employeeRepo.save(e1);
		employeeRepo.save(e2);
		employeeRepo.save(e3);
		employeeRepo.save(e4);
		
	}

}
