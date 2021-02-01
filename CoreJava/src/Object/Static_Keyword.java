package Object;

public class Static_Keyword {
	// instance variable
	// which get memory each time when we create an object of the class.
	int id;
	String name;

	// static variable
	// will get memory only once and retain its value
	static String company = "ABC";

	public Static_Keyword(int i, String n) {
		System.out.println("Inside parameterized constructor setting values " + i + " and " + n);
		id = i;
		name = n;
	}

	static void change() {
		System.out.println("Inside static method change()");
		company = "BCD";
	}

	void display() {
		System.out.println("id : " + id + "; name : " + name + "; company : " + company);
	}

	static {
		System.out.println("Inside static block 1, company : " + company);
	}

	public static void main(String[] args) {
		Static_Keyword s1 = new Static_Keyword(101, "Aritra");
		s1.display();

		Static_Keyword.change();
		Static_Keyword s2 = new Static_Keyword(101, "Sam");
		s2.display();

	}
}
