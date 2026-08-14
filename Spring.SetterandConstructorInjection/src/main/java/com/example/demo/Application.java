package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private Car car;
	
	@Autowired
	private Computer computer;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		car.drive();
		computer.printing();
		
	}
	
	
//	@PostConstruct
//	public void execute() {
//		car.drive();
//		computer.printing();
//	}

}
