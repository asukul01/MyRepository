package Exception;

import java.io.IOException;

public class ExceptionPropagation_Test {
	static void m2(int n1, int n2) throws IOException {
		int res = n1 / n2;
		System.out.println(res);
		throw new IOException("IOException");

	}

	static void m1(int n1, int n2) throws IOException {
		m2(n1, n2);
	}

	public static void divide(int n1, int n2) {
		try {
			m1(n1, n2);
		} catch (ArithmeticException e) {
			System.out.println("Exception handled : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception handled " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		divide(20, 10);
		System.out.println("rest of code");
	}
}
