package Exception;

public class Throw_Test {
	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not valid age");
		} else {
			System.out.println("Valid age");
		}
	}

	public static void main(String[] args) {
		validate(20);
		validate(12);
		System.out.println("Rest of code");
	}

}
