package com.bridgeIt.springPrax.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:EmployeeDetails.xml");
		Employee employee=(Employee)context.getBean("employee");
		System.out.println(employee);
		((AbstractApplicationContext) context).close();
		
		
	}
}
