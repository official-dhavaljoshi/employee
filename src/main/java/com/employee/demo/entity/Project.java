package com.employee.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Project {

    @Id
    private int id;
    private String projectName;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


}
