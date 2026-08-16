package com.example.demo.entity;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class Hotel {
	
	private int hotelId;
	private String hotelName;
	private String location;

}
