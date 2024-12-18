package com.employee.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeeDetail {

    @Id
    private int id;
    private String phoneNumber;
    private String address;
    private long salary;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
