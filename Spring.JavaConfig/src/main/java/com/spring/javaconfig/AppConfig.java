package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student student() {

		Student s = new Student();
		s.setId(101);
		s.setName("Pratap");
		return s;

	}
}
