package com.example.demo;

import org.springframework.stereotype.Component;

@Component("smsservice")
public class Sms implements MessageService{

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Message Service...");
	}

}
