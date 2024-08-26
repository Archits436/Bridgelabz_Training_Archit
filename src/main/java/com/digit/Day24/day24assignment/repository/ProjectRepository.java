package com.digit.Day24.day24assignment.repository;

import com.digit.Day24.day24assignment.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

