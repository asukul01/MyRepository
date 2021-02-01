package Object;

public class Constructors {

	int id;
	String name;
	int avgMark;

	Constructors(int i, String n) {
		id = i;
		name = n;
	}

	private Constructors(int i, String n, int m) {
		id = i;
		name = n;
		avgMark = m;
	}

	void display() {
		System.out.println("id : " + id + "; name : " + name);
	}

	public static void main(String[] args) {
		/*
		 * when ever there is no constructor then java will create default constructor.
		 * not creating any constructor so compiler provides you a default
		 * constructor. Here 0 and null values are provided by default
		 * constructor
		 */
		// Constructors c1 = new Constructors();
		// c1.display();

		// Creating objects and passing values
		Constructors c2 = new Constructors(1, "Aritra");
		Constructors c3 = new Constructors(2, "Nipa");
		c2.display();
		c3.display();

		// Creating objects using overloaded constructor
		Constructors c4 = new Constructors(3, "Sam", 80);
		Constructors c5 = new Constructors(3, "Harry", 90);
		c4.display();
		c5.display();
	}

}
