 /*it is possible to override method by changing the return type if subclass overrides any 
method whose return type is Non-Primitive but it changes its return type to subclass type*/

package Polymorphism;

class A {
	A method() {
		System.out.println("Parent Class A method");
		return this;
	}
}

public class CovariantReturnType_test {
	CovariantReturnType_test method() {
		System.out.println("Subclass CovariantReturnType_test method");
		return this;
	}

	public static void main(String[] args) {
		System.out.println("Object : " + new CovariantReturnType_test().method());
		System.out.println("Object : " + new A().method());
	}

}
