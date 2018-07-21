package com.bridgeIt.springPrax.beanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ServerDemo.class) ;
		Client1 client1=(Client1) context.getBean("client1");
		Client2 client2=(Client2) context.getBean("client2");
		System.out.println(client1);
		System.out.println(client2);
		((AbstractApplicationContext) context).close();
	}

}
