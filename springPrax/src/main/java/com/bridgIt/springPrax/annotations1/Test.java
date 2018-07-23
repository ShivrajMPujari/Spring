package com.bridgIt.springPrax.annotations1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.bridgIt.springPrax.annotations1");
		
		B b=context.getBean(B.class);
		b.method1();
		((AbstractApplicationContext) context).close();
	}
}
