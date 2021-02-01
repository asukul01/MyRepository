package InnerClass;

public class MemberInnerClass_Test {

	class Inner {
		public void display() {
			System.out.println("Inside Member Inner Class");
		}
	}

	public void display() {
		System.out.println("Inside main class");
	}

	public static void main(String[] args) {
		MemberInnerClass_Test m = new MemberInnerClass_Test();
		m.display();
		MemberInnerClass_Test.Inner i = m.new Inner();
		i.display();
	}

}
