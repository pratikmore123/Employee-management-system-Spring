package com.example.service;

import com.example.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    void deleteEmployee(String employeeId);

    Employee updateEmployee(String employeeId, Employee employee);

    Employee getNthLevelManager(String employeeId, int level);
}
