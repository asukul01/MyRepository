package Abstraction;

abstract class Bike {
	Bike() {
		System.out.println("Bike is created");
	}

	abstract void run();

	void gearChange() {
		System.out.println("GearChange of Bike");
	}

	static void staticMethod() {
		System.out.println("Inside static method of Bike");
	}

	static {
		System.out.println("Inside static block of Bike");
	}
}

class Honda extends Bike {
	Honda() {
		System.out.println("Honda bike is created");

	}

	void run() {
		System.out.println("Honda bike is running");
	}

	void gearChange() {
		System.out.println("GearChange of Honda Bike");
	}

	static void staticMethod() {
		System.out.println("Inside static method of Bike Honda");
	}

	static {
		System.out.println("Inside static block of Bike Honda");
	}
}

public class AbstractClass_Test {

	public static void main(String[] args) {
		Bike obj = new Honda();
		obj.run();
		obj.gearChange();
		Bike.staticMethod();
		Honda.staticMethod();
	}

}
