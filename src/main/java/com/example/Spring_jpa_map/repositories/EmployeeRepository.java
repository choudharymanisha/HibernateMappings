package com.example.Spring_jpa_map.repositories;

import com.example.Spring_jpa_map.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee,Long> {
}
