package com.oracle.jenkin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.jenkin.model.Employee;

@RestController
public class EmployeeController {

	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "A", 2000));
		employees.add(new Employee(2, "B", 3000));
		employees.add(new Employee(3, "C", 4000));
		
		return employees;
	}
}
