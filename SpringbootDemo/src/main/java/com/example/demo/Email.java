package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Email implements MessageService{

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Email service....");
	}

}
