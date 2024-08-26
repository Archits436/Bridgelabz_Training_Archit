package com.digit.Day24.day24assignment.repository;

import com.digit.Day24.day24assignment.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

