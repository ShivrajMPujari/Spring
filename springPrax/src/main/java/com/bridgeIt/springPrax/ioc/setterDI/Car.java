package com.bridgeIt.springPrax.ioc.setterDI;

public class Car {

	Engine engine;
	
	public void work(){
		engine.start();
		System.out.println("CAR is working");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
