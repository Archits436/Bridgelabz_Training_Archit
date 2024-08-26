package com.digit.Day24.day24assignment.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String address;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}

