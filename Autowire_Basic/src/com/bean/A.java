package com.bean;

public class A {
	//In case of byName autowiring mode, bean id and reference name must be same.
	B b1;

	public A(B b1) {
		this.b1 = b1;
		System.out.println("A is created");
	}

	public B getB1() {
		return b1;
	}

	public void setB1(B b1) {
		this.b1 = b1;
	}

	void print() {
		System.out.println("Hello A");
	}

	public void display() {
		print();
		b1.print();
	}

}
