package Aggregation;

public class Address {
	String city;
	String state;

	Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	void display() {
		System.out.println("City : " + city + "; state : " + state);
	}
}
