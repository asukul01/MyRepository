package Exception;

public class FinalyBlock_test {

	private static String s;

	public static void main(String[] args) {
		s = null;
		try {
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception");
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block allways executed");
		}
	}

}
