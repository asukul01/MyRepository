package Aggregation;

public class Employee {
	int empId;
	String name;
	Address address;

	Employee(int empId, String name, Address address) {
		this.address = address;
		this.empId = empId;
		this.name = name;
	}

	void display() {
		System.out.println("Employee Id : " + empId + "; Employee Name : " + name);
	}

	public static void main(String[] args) {
		Address add1 = new Address("hyderabad", "telengana");
		Employee emp1 = new Employee(101, "Aritra", add1);
		emp1.display();
		add1.display();

	}

}
