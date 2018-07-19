package com.bridgeIt.springPrax.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean implements InitializingBean , DisposableBean {

	private String message;

	public String getMessage() {
		System.out.println("your message is "+message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	 public void init(){
	      System.out.println("Bean is going through init.");
	   }
	 
	   public void destroy() {
	      System.out.println("Bean will destroy now.");
	   }

	public void afterPropertiesSet() throws Exception {
		System.out.println("your bean's property is set");
		
	}

	   
}
