package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Employee {

	@Value("001")
	private int empId;
	
	@Value("Pratap")
	private String empName;
	
	@Value("#{department.deptName}")
	private String dept_Name;
	
	@Value("#{department.deptId}")
	private int dept_Id;
	
	@Value("#{department.basicSalary+department.basicSalary*10/100}")
	private double salary;
	
	@Value("#{systemProperties['user.name']}")
    private String userName;
	
	@PostConstruct
    public void display() {
		
        System.out.println("Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", deptName='" + dept_Name + '\'' +
                ", depiId=" + dept_Id +
                ", salary=" + salary +
                ", userName='" + userName + '\'' +
                '}');
	}
	
}
