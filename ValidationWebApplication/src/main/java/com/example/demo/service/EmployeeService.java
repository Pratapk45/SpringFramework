package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public class EmployeeService {

    private Map<Integer, Employee> employees = new java.util.HashMap<>();


    // Add Employee
    public Employee addEmployee(Employee employee) {

        employees.put(employee.getEmpID(), employee);

        return employee;
    }


    // Get All Employees
    public List<Employee> getAllEmployee() {
  
        return new ArrayList<>(employees.values());
    }


    // Get Employee By ID
    public Employee getById(Integer empID) {

        return employees.get(empID);
    }
}
