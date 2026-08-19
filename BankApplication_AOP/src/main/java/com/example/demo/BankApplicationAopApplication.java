package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplicationAopApplication implements CommandLineRunner {

	@Autowired
	private BankService bankService;

	public static void main(String[] args) {
		SpringApplication.run(BankApplicationAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("========== BANK APPLICATION ==========");

		// Create accounts
		bankService.createAccount(101, "Pratap", 10000);

		bankService.createAccount(102, "Rahul", 15000);

		bankService.createAccount(103, "Amit", 20000);

		// Deposit
		bankService.deposit(101, 5000);

		// Withdraw
		bankService.withdraw(102, 3000);

		// Check balance
		bankService.checkBalance(101);

		// Display all accounts
		bankService.displayAccounts();
	}

}
