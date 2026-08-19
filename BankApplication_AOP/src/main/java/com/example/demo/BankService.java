package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    private Map<Integer, Account> accounts = new HashMap<>();

    // Create account
    public void createAccount(int accountNumber, String holderName,
                              double initialBalance) {

        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists.");
            return;
        }

        Account account =
                new Account(accountNumber, holderName, initialBalance);

        accounts.put(accountNumber, account);

        System.out.println("Account created successfully.");
    }

    // Deposit
    public void deposit(int accountNumber, double amount) {

        Account account = accounts.get(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        account.setBalance(account.getBalance() + amount);

        System.out.println("Amount deposited successfully.");
    }

    // Withdraw
    public void withdraw(int accountNumber, double amount) {

        Account account = accounts.get(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
            return;
        }

        account.setBalance(account.getBalance() - amount);

        System.out.println("Amount withdrawn successfully.");
    }

    // Check balance
    public void checkBalance(int accountNumber) {

        Account account = accounts.get(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.println(
                "Account Number : " + account.getAccountNumber());

        System.out.println(
                "Holder Name    : " + account.getHolderName());

        System.out.println(
                "Balance        : " + account.getBalance());
    }

    // Display all accounts
    public void displayAccounts() {

        System.out.println("\n========== ALL ACCOUNTS ==========");

        System.out.printf(
                "%-10s %-20s %s%n",
                "Account No", "Holder Name", "Balance");

        System.out.println("-----------------------------------------------");

        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }
}