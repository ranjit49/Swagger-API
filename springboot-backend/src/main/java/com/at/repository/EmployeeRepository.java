package com.at.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.at.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
