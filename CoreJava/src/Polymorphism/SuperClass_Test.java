package Polymorphism;

class Animal {
	String color = "Black";

	public Animal() {
		System.out.println("Super class constructor");
	}

	void display() {
		System.out.println("Super class method color");
	}
}

class Dog extends Animal {
	String color = "White";

	Dog() {
		// By default JVM adds super() in the first line of child constructor
		// super();
		System.out.println("Child Class constructor");
	}

	void display() {
		super.display();
		System.out.println("Color of animal = " + super.color);
		System.out.println("Color of dog = " + color);
		System.out.println("Child class method");
	}
}

class Person {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Emp extends Person {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name);// reusing parent constructor
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class SuperClass_Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.display();
		
		Emp e1=new Emp(1,"ankit",45000f);  
		e1.display();  
	}

}
