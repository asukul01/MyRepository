package InnerClass;

interface A {
	void display();
}

public class AnonymousInnerClass_Test {
	public static void main(String[] args) {
		A obj = new A() {
			public void display() {
				System.out.println("Inside display");
			}

		};
		obj.display();
	}
}
