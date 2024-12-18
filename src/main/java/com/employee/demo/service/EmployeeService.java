package com.employee.demo.service;

import com.employee.demo.entity.Employee;
import com.employee.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployee(){
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    public Employee getEmployeeWithProjectandDetail(Integer id) {
        Employee employee = employeeRepository.getById(id);
        return employee;
    }
    }
