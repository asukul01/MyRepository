package com.bean.DI;

import java.util.Map;

public class Employee {
	private int id;
	private String name;
	private Address address;
	private Map<String, Integer> proficiency;

	public Employee(int id, String name, Address address, Map<String, Integer> proficiency) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.proficiency = proficiency;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public void displayInfo() {
		System.out.println(this.toString());
		proficiency.forEach((technology, points) -> System.out.println(technology + " : " + points));
		System.out.println("=======================");
	}

}
