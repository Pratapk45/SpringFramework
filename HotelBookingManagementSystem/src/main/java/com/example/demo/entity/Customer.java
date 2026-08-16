package com.example.demo.entity;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;


@Getter
@Builder
public class Customer {
	
	private int customerId;
	private String customerName;
	private String city;

}
