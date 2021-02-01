package Polymorphism;

class Adder {
	static int add(int n1, int n2) {
		return n1 + n2;
	}

	static int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	static double add(int n1, double n2) {
		return n1 + n2;
	}
}

public class MethodOverloading_Test {

	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println("1 + 2 = " + Adder.add(1, 2));
		System.out.println("1 + 2 + 3 = " + Adder.add(1, 2, 3));
		System.out.println("1 + 2 = " + Adder.add(2, 2.0));
		MethodOverloading_Test.main("Hello");
	}

	public static void main(String args) {
		System.out.println("overloaded main method " + args);
	}

}
