package com.tamatech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamatech.demo.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
