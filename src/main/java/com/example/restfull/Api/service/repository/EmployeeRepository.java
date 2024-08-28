package com.example.restfull.Api.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restfull.Api.service.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	

}