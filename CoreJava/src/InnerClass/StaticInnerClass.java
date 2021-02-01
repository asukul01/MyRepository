package InnerClass;

class Outer {
	private  static int test = 5;
	public static void testOuterMethod(){
		System.out.println("Outer method");
	}
	public static class Inner {
		
		public static int x = 0;
		public static void testingInnerMethod() {
			System.out.println("Inside testingInnerMethod method");
			System.out.println("Test variable value : " + test);
			testOuterMethod();
		}
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		Outer.Inner.testingInnerMethod();
		System.out.println(Outer.Inner.x);
		Outer.testOuterMethod();
	}

}
