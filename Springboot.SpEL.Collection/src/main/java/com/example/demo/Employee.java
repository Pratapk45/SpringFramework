package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("employee")
public class Employee {

    @Value("#{{1,2,3,4,5,6,7,8,9,10}}")
    private List<Integer> empIds;

    @Value("#{{'Pratap','Rahul','Amit','Sneha','Priya','Rohit','Neha','Akash','Pooja','Vikas'}}")
    private List<String> empNames;

    // Department index for each employee
    @Value("#{{0,0,1,2,2,3,3,4,4,1}}")
    private List<Integer> deptIndexes;


    @PostConstruct
    public void display() {

        System.out.println();
        System.out.println("=================================================================");
        System.out.println("                       EMPLOYEE DETAILS");
        System.out.println("=================================================================");

        System.out.printf("%-8s %-15s %-10s %-15s %-12s%n", "EMP ID", "EMP NAME", "DEPT ID","DEPARTMENT", "SALARY");

        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < empIds.size(); i++) {

            int deptIndex = deptIndexes.get(i);

            System.out.printf(
                    "%-8d %-15s %-10d %-15s %-12.2f%n",

                    empIds.get(i),

                    empNames.get(i),

                    department.getDeptIds().get(deptIndex),

                    department.getDeptNames().get(deptIndex),

                    department.getBasicSalaries().get(deptIndex) * 1.10
            );
        }

        System.out.println("=================================================================");
    }


    @org.springframework.beans.factory.annotation.Autowired
    private Department department;
}