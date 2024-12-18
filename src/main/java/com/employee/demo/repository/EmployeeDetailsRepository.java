package com.employee.demo.repository;

import com.employee.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class EmployeeDetailsRepository implements JpaRepository<Employee, Integer> {
}
