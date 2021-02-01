package FactoryPattern;

public abstract class Plan {
	protected double rate;
	abstract void getrate();
	
	void calcultaeBill(int units){
		System.out.println(rate*units);
	}
}
