package com.bean.IOC;

public class Student {
	public String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello " + name);
	}
}
