package com.example.demo.entity;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class Booking {
	
	private int bookingId;
	private String roomType;
	private double amount;
	
	private Hotel hotel;
	private Customer customer;

}
