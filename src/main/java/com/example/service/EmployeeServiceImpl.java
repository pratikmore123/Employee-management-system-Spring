package com.example.service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setId(java.util.UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(String employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public Employee updateEmployee(String employeeId, Employee employee) {
        Optional<Employee> existingEmployee = employeeRepository.findById(employeeId);
        if (existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setEmployeeName(employee.getEmployeeName());
            updatedEmployee.setPhoneNumber(employee.getPhoneNumber());
            updatedEmployee.setEmail(employee.getEmail());
            updatedEmployee.setReportsTo(employee.getReportsTo());
            updatedEmployee.setProfileImage(employee.getProfileImage());
            return employeeRepository.save(updatedEmployee);
        } else {
            throw new RuntimeException("Employee not found with ID: " + employeeId);
        }
    }

    @Override
    public Employee getNthLevelManager(String employeeId, int level) {
        // Placeholder implementation - you need to implement the actual logic
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
