package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("department")
public class Department {

    @Value("#{{101, 102, 103, 104, 105}}")
    private List<Integer> deptIds;

    @Value("#{{'IT', 'HR', 'Finance', 'Sales', 'Development'}}")
    private List<String> deptNames;

    @Value("#{{30000.0, 25000.0, 35000.0, 20000.0, 40000.0}}")
    private List<Double> basicSalaries;


    public List<Integer> getDeptIds() {
        return deptIds;
    }

    public List<String> getDeptNames() {
        return deptNames;
    }

    public List<Double> getBasicSalaries() {
        return basicSalaries;
    }
}
