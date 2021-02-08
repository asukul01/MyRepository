package com.bean.DI;

public class Address {
	private String city;
	private String state;
	private int pin;

	public Address(String city, String state, int pin) {
		super();
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}

}
