package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    // Add Employee
    @PostMapping
    public ResponseEntity<Employee> addEmployee(
            @Valid @RequestBody Employee employee) {

        return ResponseEntity.ok(
                employeeService.addEmployee(employee)
        );
    }


    // Get All Employees
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee() {

        return ResponseEntity.ok(
                employeeService.getAllEmployee()
        );
    }


    // Get Employee By ID
    @GetMapping("/{empID}")
    public ResponseEntity<Employee> getById(
            @PathVariable Integer empID) {

        Employee employee = employeeService.getById(empID);

        return ResponseEntity.ok(employee);
    }
}
