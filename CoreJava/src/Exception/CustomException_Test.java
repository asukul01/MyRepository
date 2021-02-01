package Exception;

class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String msg) {
		super(msg);
	}
}

public class CustomException_Test {

	void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Invalid age");
		} else
			System.out.println("Valid age");
	}

	public static void main(String[] args) throws InvalidAgeException {
		CustomException_Test obj = new CustomException_Test();
		try {
			obj.validate(15);
			obj.validate(20);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Rest of the code");
	}

}
