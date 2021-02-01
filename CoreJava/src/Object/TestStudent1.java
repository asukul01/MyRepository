package Object;

class Student {
	int id;
	String name;
	int avgMark;

	// Initialization through method
	void insertRecord(int r, String n, int m) {
		id = r;
		name = n;
		avgMark = m;
	}

	void display() {
		System.out.println("id : " + id + "; name : " + name + "; average marks : " + avgMark);
	}
}

public class TestStudent1 {
	public static void main(String[] args) {
		Student s = new Student();

		// Initializing through reference variable
		s.id = 101;
		s.name = "Aritra";
		System.out.println("id : " + s.id + "; name : " + s.name + "; average marks : " + s.avgMark);

		// Initialization through method
		Student s2 = new Student();
		// s2.insertRecord(102, "Nipa");
		s2.insertRecord(102, "Nipa", 90);
		Student s3 = new Student();
		s2.insertRecord(103, "Sam", 80);
		s2.display();
		s3.display();
		
		//Cannot initialize Constructor class as the constructor is private and is not visible.
		//Constructors c5 = new Constructors(3, "Harry", 90);
	}
}
