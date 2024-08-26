package com.digit.Day24.day24assignment.repository;

import com.digit.Day24.day24assignment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByUsername(String username);
}

