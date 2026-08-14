package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	//Constructor Enjection
	@Autowired
	public Car( Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.start();
		System.out.println("car is running....");
	}
	
	

}
