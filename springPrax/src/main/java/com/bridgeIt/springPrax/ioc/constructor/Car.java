package com.bridgeIt.springPrax.ioc.constructor;

public class Car {

	Engine engine ;
	
	public Car(Engine engine) {
	
		this.engine = engine;
	}
	
	public void work(){
		engine.start();
		System.out.println("CAR is working");
	}
}
