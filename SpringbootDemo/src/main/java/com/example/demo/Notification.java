package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;


@Component
public class Notification {
	
	@Autowired
	private MessageService messageService;
	
	@Autowired
//  @Qualifier("sms")
	@Qualifier("smsservice")
	private MessageService messageService2;
	
	@PostConstruct
	public void show() {
		
		messageService.sendMessage();
		
		messageService2.sendMessage();
	}

}
