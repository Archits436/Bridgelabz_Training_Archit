package com.digit.Day24.day24assignment.repository;

import com.digit.Day24.day24assignment.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

