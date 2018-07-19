package com.bridgeIt.springPrax.ioc.setterDI;

public class Engine {

	private String engineName;
		
		public String getEngineName() {
			return engineName;
		}
	
		public void setEngineName(String engineName) {
			this.engineName = engineName;
		}
	
		public void start() {
			System.out.println(engineName +" is started");
		}
}
