package com.bridgeIt.springPrax.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainScope {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope.xml");
		BeanScope bean1	=(BeanScope)context.getBean("protoBean");
		BeanScope SingletonBean1	=(BeanScope)context.getBean("singletonBean");
		
		BeanScope bean2	=(BeanScope)context.getBean("protoBean");
		BeanScope SingletonBean2	=(BeanScope)context.getBean("singletonBean");
		
		System.out.println("prototype bean-"+bean1);
		System.out.println("singleton bean -"+SingletonBean1);
		
		System.out.println("-----------");
		
		System.out.println("prototype bean-"+bean2);
		System.out.println("singleton bean -"+ SingletonBean2);
		
	}
}
