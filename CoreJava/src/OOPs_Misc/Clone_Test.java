package OOPs_Misc;

public class Clone_Test implements Cloneable {
	int id;
	String name;

	public Clone_Test(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Clone_Test obj1 = new Clone_Test(101, "Sam");
		Clone_Test obj2 = (Clone_Test) obj1.clone();

		System.out.println("Id = " + obj1.id + "; Name = " + obj1.name);
		System.out.println("Id = " + obj2.id + "; Name = " + obj2.name);
	}
}
