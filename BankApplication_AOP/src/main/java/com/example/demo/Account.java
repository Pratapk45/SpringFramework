package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Account {

	    private int accountNumber;
	    private String holderName;
	    private double balance;

	   
	}
