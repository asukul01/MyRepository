package Exception;

import java.io.IOException;

class Parent {
	void display() {
		System.out.println("parent method");
	}

	void message() throws RuntimeException {
		System.out.println("Parent method message");
	}
}

public class MethodOverriding extends Parent {

	// If the superclass method does not declare an exception, subclass
	// overridden method cannot declare the checked exception, but can declare
	// unchecked exception
	void dispaly() {
		try{
			System.out.println("Derived class method");
			throw new IOException();	
		}catch(Exception e){
			System.out.println("Dderived class method display");
		}
		
	}

	// If the superclass method declares an exception, subclass overridden
	// method can declare same, subclass exception or no exception but cannot
	// declare parent exception.
	void message() throws ArithmeticException {
		System.out.println("Subclass method message");
	}

	public static void main(String[] args){
		MethodOverriding m = new MethodOverriding();
		m.dispaly();
	}
}
