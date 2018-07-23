package com.bridgeIt.springPrax.autowire;

public class Employee {

	private int id;
	private String name;
	private String role;
	private Address address1;
	
	public void showDetails(Employee employee) {
		
		System.out.println(employee);
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", address=" + address1 + "]";
	}


	public Address getAddress1() {
		return address1;
	}
	public void setAddress(Address address) {
		this.address1 = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
