package com.bridgeIt.springPrax.ioc.constList;

import java.util.List;

public class Teacher {

	private String name;
	private String subject;
	private List<String> students;
	
	Teacher(String name,String subject,List<String> students){
		
		this.name=name;
		this.subject=subject;
		this.students=students;
	}

	public void displayInfo() {
		
		System.out.println(name);
		System.out.println(subject);
		
		System.out.println("Students:- "+students.toString());
		
	}
	
	
	public String getName() {
		System.out.println("getter called");
		return name;
	}

	public void setName(String name) {
		System.out.println("setter called");
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<String> getStudents() {
		return students;
	}

	public void setStudents(List<String> students) {
		this.students = students;
	}
}
