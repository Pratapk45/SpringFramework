package com.spring.javaconfig;

public class Student {
	
	private int id;
	private String name;
	
	
	public Student() {
		System.out.println("Default constructor...");
	}

//	public Student(int id, String name) {
//	System.out.println("Parameteriesed constructor...");
//		this.id = id;
//		this.name = name;
//	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
    }

}
