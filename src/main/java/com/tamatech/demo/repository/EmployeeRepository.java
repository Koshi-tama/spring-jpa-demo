package com.tamatech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamatech.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
