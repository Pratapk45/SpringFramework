package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("employee")
public class Employee {

	@Value("#{{1, 2, 3, 4, 5, 6}}")
	private List<Integer> empIds;

	@Value("#{{'Pratap', 'Rahul', 'Amit', 'Sneha', 'Priya', 'Rohit'}}")
	private List<String> empNames;

	@Value("#{{0, 0, 1, 2, 2, 3}}")
	private List<Integer> deptIndexes;

	// Employee 1
	@Value("#{department.deptIds[0]}")
	private int deptId1;

	@Value("#{department.deptNames[0]}")
	private String deptName1;

	@Value("#{department.basicSalaries[0] * 1.10}")
	private double salary1;

	// Employee 2
	@Value("#{department.deptIds[0]}")
	private int deptId2;

	@Value("#{department.deptNames[0]}")
	private String deptName2;

	@Value("#{department.basicSalaries[0] * 1.10}")
	private double salary2;

	// Employee 3
	@Value("#{department.deptIds[1]}")
	private int deptId3;

	@Value("#{department.deptNames[1]}")
	private String deptName3;

	@Value("#{department.basicSalaries[1] * 1.10}")
	private double salary3;

	// Employee 4
	@Value("#{department.deptIds[2]}")
	private int deptId4;

	@Value("#{department.deptNames[2]}")
	private String deptName4;

	@Value("#{department.basicSalaries[2] * 1.10}")
	private double salary4;

	// Employee 5
	@Value("#{department.deptIds[2]}")
	private int deptId5;

	@Value("#{department.deptNames[2]}")
	private String deptName5;

	@Value("#{department.basicSalaries[2] * 1.10}")
	private double salary5;

	// Employee 6
	@Value("#{department.deptIds[3]}")
	private int deptId6;

	@Value("#{department.deptNames[3]}")
	private String deptName6;

	@Value("#{department.basicSalaries[3] * 1.10}")
	private double salary6;

	@PostConstruct
	public void display() {

	    System.out.println();
	    System.out.println("==============================================================");
	    System.out.println("                    EMPLOYEE DETAILS");
	    System.out.println("==============================================================");

	    System.out.printf("%-10s %-15s %-10s %-15s %-15s%n",
	            "EMP ID", "EMP NAME", "DEPT ID", "DEPARTMENT", "SALARY");

	    System.out.println("--------------------------------------------------------------");

	    System.out.printf("%-10d %-15s %-10d %-15s %-15.0f%n",
	            empIds.get(0), empNames.get(0),
	            deptId1, deptName1, salary1);

	    System.out.printf("%-10d %-15s %-10d %-15s %-15.0f%n",
	            empIds.get(1), empNames.get(1),
	            deptId2, deptName2, salary2);

	    System.out.printf("%-10d %-15s %-10d %-15s %-15.0f%n",
	            empIds.get(2), empNames.get(2),
	            deptId3, deptName3, salary3);

	    System.out.printf("%-10d %-15s %-10d %-15s %-15.0f%n",
	            empIds.get(3), empNames.get(3),
	            deptId4, deptName4, salary4);

	    System.out.printf("%-10d %-15s %-10d %-15s %-15.0f%n",
	            empIds.get(4), empNames.get(4),
	            deptId5, deptName5, salary5);

	    System.out.printf("%-10d %-15s %-10d %-15s %-15.0f%n",
	            empIds.get(5), empNames.get(5),
	            deptId6, deptName6, salary6);

	    System.out.println("==============================================================");
	}
}