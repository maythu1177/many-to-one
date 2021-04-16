package com.sp.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sp.tech.service.EmployeeService;

@SpringBootApplication
public class OneToManyDemo1Application implements CommandLineRunner {
	
	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyDemo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeService.saveEmployee();
	}

}
