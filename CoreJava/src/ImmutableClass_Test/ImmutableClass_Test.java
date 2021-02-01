package ImmutableClass_Test;

public class ImmutableClass_Test {

	public static void main(String[] args) {
		Address add = new Address("Hyderabad", "Telengana");

		ImmutableClass_Student stu = new ImmutableClass_Student(101, "Aritra", add);

		System.out.println(stu.toString());
	}

}
