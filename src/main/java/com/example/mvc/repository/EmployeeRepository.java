package com.example.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvc.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findByUserName(String username);

}
