package com.bridgeIt.springPrax.circularDependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.bridgeIt.springPrax.circularDependency");
		A a=context.getBean(A.class);
		System.out.println(a);
		context.close();
	}

}
